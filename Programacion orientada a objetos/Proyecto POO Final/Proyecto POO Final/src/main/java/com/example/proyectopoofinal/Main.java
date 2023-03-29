package com.example.proyectopoofinal;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static ArrayList<DemandaCivil> DemandasCivil = new ArrayList<>();
    public static ArrayList<DemandaMercantil> DemandasMercantil = new ArrayList<>();
    public static ArrayList<DemandaJuridisccionVoluntaria> DemandasJurisdiccionVoluntaria = new ArrayList<>();
    public static ArrayList<Juzgado> ListaJuzgados = new ArrayList<>();
    public static ArrayList<Trabajador> ListaTrabajadores= new ArrayList<>();


    public static void main(String[] args) {
        ListaJuzgados.add(new Juzgado(1,"Arriaga"));
        ListaTrabajadores.add(new Trabajador("Armando","Lopez",1));
        
        mostrarMenu();
        
    }
    public static void mostrarMenu(){

        int opcionMenu;

        do {

            System.out.println("Que desea hacer   1.Añadir Demanda   2 Ver Demandas   3 BuscarDemanda  4.Añadir Juzgado o trabajador (Administrador)  5.Salir  ");
            opcionMenu=new Scanner(System.in).nextInt();

            switch (opcionMenu) {
                case 1 -> {anadirDemanda();}
                case 2 -> {verDemandas();}
                case 3 -> {buscarDemanda();}
                case 4 -> {anadirJuzgadoOTrabajador();}

            }
        }while(opcionMenu != 5);

    }
    public static void anadirJuzgadoOTrabajador(){
        System.out.println("Que desea hacer   1.Añadir Trabajador 2.Añadir Juzgado  3.Regresar a Menu  ");
        int opcionAnadir=new Scanner(System.in).nextInt();

        switch (opcionAnadir) {
            case 1 -> {anadirTrabajador();}
            case 2 -> {anadirJuzgado();}

        }
    }
    public static void anadirJuzgado(){
        System.out.println("ingresa el numero de juzgado");
        int numeroJuzgado=new Scanner(System.in).nextInt();
        numeroJuzgado= validarNumero2Parametros(0,100000000,numeroJuzgado);

        for (Juzgado juzgado :ListaJuzgados) {
            while (numeroJuzgado==juzgado.getNumeroJuzgado()){
                System.out.println("ingresa un numero de juzgado valido");
                numeroJuzgado=new Scanner(System.in).nextInt();
                numeroJuzgado= validarNumero2Parametros(0,100000000,numeroJuzgado);

            }
        }

        System.out.println("ingresa el lugar del juzgado");
        String lugarJuzgado=new Scanner(System.in).next();
        Juzgado juzgado = new Juzgado(numeroJuzgado,lugarJuzgado);
        ListaJuzgados.add(juzgado);
    }
    public static void anadirTrabajador(){
        System.out.println("ingresa el nombre del trabajador");
        String nombre=new Scanner(System.in).next();
        System.out.println("ingresa el apellido del trabajador");
        String apellido=new Scanner(System.in).next();
        System.out.println("ingresa clave del trabajador");
        int clave =new Scanner(System.in).nextInt();
        clave= validarNumero2Parametros(0,100000000,clave);

        for (Trabajador trabajador :ListaTrabajadores) {
            while (clave==trabajador.getClaveIdentificador()){
                System.out.println("ingresa un numero de trabajador valido");
                clave=new Scanner(System.in).nextInt();
                clave= validarNumero2Parametros(0,100000000,clave);

            }
        }

        Trabajador trabajador = new Trabajador(nombre,apellido,clave);
        ListaTrabajadores.add(trabajador);
    }
    public static void buscarDemanda(){
        System.out.println("Que tipo de demanda Busca 1.Demanda Civil   2 Demanda Mercantil   3 Jurisdiccion Voluntaria");
        int opcionBuscar=new Scanner(System.in).nextInt();
        switch (opcionBuscar) {
            case 1 -> {
                System.out.println("Ingresa el codigo de la demanda a buscar");
                String codigo = new Scanner(System.in).next();
                buscarDemandaCivil(codigo);}
            case 2 -> {
                System.out.println("Ingresa el codigo de la demanda a buscar");
                String codigo = new Scanner(System.in).next();
                buscarDemandaMercantil(codigo);}
            case 3 -> {
                System.out.println("Ingresa el codigo de la demanda a buscar");
                String codigo = new Scanner(System.in).next();
               buscarJuridisccionVoluntaria(codigo);}
        }

    }
    public static void anadirDemanda(){
       
        System.out.println("Que demanda desea Agregar   1.Demanda Civil   2 Demanda Mercantil   3 Jurisdiccion Voluntaria   4.regresar al menu  ");
        int opcionDemanda=new Scanner(System.in).nextInt();
        
        switch (opcionDemanda){

            case 1 -> {anadirDemandaCivil();}
            case 2 -> {anadirDemandaMercantil();}
            case 3 -> {anadirDemandaJurisdiccionVoluntaria();}
            default-> {}
        }
    }
    public static void verDemandas(){
        System.out.println("Que Demanda quiere ver  1.Demandas Civil  2.Demandas Mercantail  3.Demandas Jurisdiccion Voluntaria");
        int opcionVer=new Scanner(System.in).nextInt();

        switch (opcionVer){

            case 1 -> {
                verDemandaCivil();}
            case 2 -> {
                verDemandaMercantil();}
            case 3 -> {
                verDemandaJurisdicionVoluntaria();}
            default-> {}
        }
    }

    public static Demanda formatoDemanda(){
        String Nombre = null,Apellido,Ramo,TipoJuicio,Fecha,Municipio;
        int IdentificadorTrabajador,NumeroJuzgado,numeroHojas;

        System.out.println("Ingresa el Nombre del Cliente");
        Nombre=new  Scanner(System.in).next();

        System.out.println("Ingresa el Apellido del Cliente");
        Apellido=new  Scanner(System.in).next();



        System.out.println("Ingresar el identificador del Trabajador");
        IdentificadorTrabajador=new  Scanner(System.in).nextInt();
        Trabajador trabajador = buscarTrabajador(IdentificadorTrabajador);

        while (trabajador==null){
            System.out.println("Ingresar un identificador del Trabajador Valido");
            IdentificadorTrabajador=new  Scanner(System.in).nextInt();
            trabajador = buscarTrabajador(IdentificadorTrabajador);
        }


        System.out.println("Ingresa el numero del Juzgado");
        NumeroJuzgado =new  Scanner(System.in).nextInt();
        Juzgado juzgado = buscarJuzgado(NumeroJuzgado);

        while (juzgado==null){
            System.out.println("Ingresar un Juzgado valido");
            NumeroJuzgado=new  Scanner(System.in).nextInt();
            juzgado = buscarJuzgado(NumeroJuzgado);
        }

        System.out.println("Ingresa el Municipio");
        Municipio=new  Scanner(System.in).next();

        System.out.println("Ingresa el ramo de la demanda");
        Ramo =new  Scanner(System.in).next();

        System.out.println("Ingresa el tipo de Juicio");
        TipoJuicio=new  Scanner(System.in).next();


        numeroHojas=pedirHojasDemanda();
        Fecha=pedirFecha();

        Random codigoTemp=new Random();
        int codigoTemp2= codigoTemp.nextInt(10000000 - 1000000)+ 1000000;
        String codigo = (String) (codigoTemp2 + "");

        Clientes cliente=new Clientes(Nombre,Apellido);

        Demanda demanda = new Demanda(cliente,juzgado,trabajador,Municipio,Ramo,TipoJuicio,numeroHojas,Fecha,codigo);
        return demanda;

    }
    public static void anadirDemandaCivil(){
        String NombreDemandado,ApellidoDemandado;

        Demanda demanda=formatoDemanda();

        System.out.println("Ingresa el Nombre del Demandado");
        NombreDemandado=new  Scanner(System.in).next();

        System.out.println("Ingresa el Apellido del Demandado");
        ApellidoDemandado=new  Scanner(System.in).next();
        DemandaCivil demandaCivil=new DemandaCivil(demanda.getCliente(),demanda.getJuzgado(),demanda.getTrabajador(),demanda.getMunicipio(),demanda.getRamo(),demanda.getTipoDeJuicio(),demanda.getNumeroDeHojas(),demanda.getFechaDePresentacion(), demanda.getCodigo(), NombreDemandado,ApellidoDemandado);
        DemandasCivil.add(demandaCivil);

        System.out.println("El codigo es: "+ demanda.getCodigo());

    }
    public static void anadirDemandaMercantil(){
        String empresaDemandada;
        Demanda demanda=formatoDemanda();

        System.out.println("Ingresa la empresa Demandada");
        empresaDemandada=new  Scanner(System.in).next();

        DemandaMercantil demandaMercantil = new DemandaMercantil(demanda.getCliente(),demanda.getJuzgado(),demanda.getTrabajador(),demanda.getMunicipio(),demanda.getRamo(),demanda.getTipoDeJuicio(),demanda.getNumeroDeHojas(),demanda.getFechaDePresentacion(), demanda.getCodigo(),empresaDemandada);
        DemandasMercantil.add(demandaMercantil);
        System.out.println("El codigo es: "+ demanda.getCodigo());

    }
    public static void anadirDemandaJurisdiccionVoluntaria(){
        String jurisdiccionVoluntaria;
        Demanda demanda=formatoDemanda();

        System.out.println("Ingresa la jurisdiccionVoluntaria");
        jurisdiccionVoluntaria=new  Scanner(System.in).next();
        DemandaJuridisccionVoluntaria demandaJuridisccionVoluntaria = new DemandaJuridisccionVoluntaria(demanda.getCliente(),demanda.getJuzgado(),demanda.getTrabajador(),demanda.getMunicipio(),demanda.getRamo(),demanda.getTipoDeJuicio(),demanda.getNumeroDeHojas(),demanda.getFechaDePresentacion(), demanda.getCodigo(),jurisdiccionVoluntaria);
        DemandasJurisdiccionVoluntaria.add(demandaJuridisccionVoluntaria);
        System.out.println("El codigo es: "+ demanda.getCodigo());


    }
    
    public static Trabajador buscarTrabajador(int identificador){
        for (Trabajador trabajador: ListaTrabajadores) {
            if (trabajador.getClaveIdentificador() == identificador){
                return trabajador;

            }

        }
        return null;
    }
    public static Juzgado buscarJuzgado(int numeroJuzgado){
        for (Juzgado juzgado: ListaJuzgados) {
            if (juzgado.getNumeroJuzgado() == numeroJuzgado){
                return juzgado;
            }

        }
        return null;
    }

    public static String pedirFecha(){
        int Dia,Mes,Anio;
        String Fecha;
        System.out.println("Ingresa el dia de presentacion de la demanda  (En numero)");
        Dia=new  Scanner(System.in).nextInt();
        Dia= validarNumero2Parametros(0,31,Dia);
        System.out.println("Ingreda el mes de presentacion de la demanda (En numero)");
        Mes=new  Scanner(System.in).nextInt();
        Mes= validarNumero2Parametros(0,13,Mes);
        System.out.println("Ingresa el año de presentacion de la demanda(En numero)");
        Anio=new  Scanner(System.in).nextInt();
        Anio= validarNumero2Parametros(2019,2024,Anio);


        Fecha=(String) (Dia+"/"+Mes+"/"+Anio);
        return Fecha;
    }
    public static int pedirHojasDemanda(){
        int numeroHojas;
        System.out.println("Ingresa el numero de hojas de la demanda");
        numeroHojas=new  Scanner(System.in).nextInt();
        while( numeroHojas < 1){
            System.out.println("Ingresa un numero de hojasValida");
            numeroHojas=new  Scanner(System.in).nextInt();
        }
        return numeroHojas;
    }
    public static void verDemandaCivil(){
        int NumeroDemanda=1;
        boolean a = false;

        for (DemandaCivil demandasCivil: DemandasCivil) {
            a =true;
            System.out.println("Demanda Numero: "+ NumeroDemanda);
            System.out.println("Cliente: " + demandasCivil.getCliente().getNombre()+" "+demandasCivil.getCliente().getApellido() );
            System.out.println("Juzgado numero: " + demandasCivil.getJuzgado().getNumeroJuzgado());
            System.out.println("Trabajador: " + demandasCivil.getTrabajador().getNombre()+ " "+ demandasCivil.getTrabajador().getApellido() + " Clave Identificador: "+ demandasCivil.getTrabajador().getClaveIdentificador());
            System.out.println("Municipio: "+demandasCivil.getMunicipio());
            System.out.println("Ramo: "+ demandasCivil.getRamo());
            System.out.println("Tipo de Juicio: " + demandasCivil.getTipoDeJuicio());
            System.out.println("Hojas de la Demanda: "+ demandasCivil.getNumeroDeHojas());
            System.out.println("Fecha En la que se presento la Demanda: "+ demandasCivil.getFechaDePresentacion());
            System.out.println("Codigo de Demanda: "+ demandasCivil.getCodigo());
            System.out.println("Persona Demandada: "+ demandasCivil.getNombreDemandado()+ " "+demandasCivil.getApellidoDemandado());
            NumeroDemanda += NumeroDemanda;
        }
        if (a ==false){
            System.out.println("No se encontraron demandas");
        }

    }   //Listo
    public static void verDemandaMercantil(){
        int NumeroDemanda=1;
        boolean a = false;

        for (DemandaMercantil demandasMercantil: DemandasMercantil) {
            a =true;
            System.out.println("Demanda Numero: "+ NumeroDemanda);
            System.out.println("Cliente: " + demandasMercantil.getCliente().getNombre()+" "+demandasMercantil.getCliente().getApellido() );
            System.out.println("Juzgado numero: " + demandasMercantil.getJuzgado().getNumeroJuzgado());
            System.out.println("Trabajador: " + demandasMercantil.getTrabajador().getNombre()+ " "+ demandasMercantil.getTrabajador().getApellido() + " Clave Identificador: "+ demandasMercantil.getTrabajador().getClaveIdentificador());
            System.out.println("Municipio: "+demandasMercantil.getMunicipio());
            System.out.println("Ramo: "+ demandasMercantil.getRamo());
            System.out.println("Tipo de Juicio: " + demandasMercantil.getTipoDeJuicio());
            System.out.println("Hojas de la Demanda: "+ demandasMercantil.getNumeroDeHojas());
            System.out.println("Fecha En la que se presento la Demanda: "+ demandasMercantil.getFechaDePresentacion());
            System.out.println("Codigo de Demanda: "+ demandasMercantil.getCodigo());
            System.out.println("Persona Demandada: "+ demandasMercantil.getEmpresaDemandada());
            NumeroDemanda += NumeroDemanda;
        }
        if (a ==false){
            System.out.println("No se encontraron demandas");
        }



    } //Listo
    public static void verDemandaJurisdicionVoluntaria(){
        int NumeroDemanda=1;
        boolean a= false;
        for (DemandaJuridisccionVoluntaria demandaJuridisccionVoluntaria: DemandasJurisdiccionVoluntaria) {
            a=true;
            System.out.println("Demanda Numero: "+ NumeroDemanda);
            System.out.println("Cliente: " + demandaJuridisccionVoluntaria.getCliente().getNombre()+" "+demandaJuridisccionVoluntaria.getCliente().getApellido() );
            System.out.println("Juzgado numero: " + demandaJuridisccionVoluntaria.getJuzgado().getNumeroJuzgado());
            System.out.println("Trabajador: " + demandaJuridisccionVoluntaria.getTrabajador().getNombre()+ " "+ demandaJuridisccionVoluntaria.getTrabajador().getApellido() + " Clave Identificador: "+ demandaJuridisccionVoluntaria.getTrabajador().getClaveIdentificador());
            System.out.println("Municipio: "+demandaJuridisccionVoluntaria.getMunicipio());
            System.out.println("Ramo: "+ demandaJuridisccionVoluntaria.getRamo());
            System.out.println("Tipo de Juicio: " + demandaJuridisccionVoluntaria.getTipoDeJuicio());
            System.out.println("Hojas de la Demanda: "+ demandaJuridisccionVoluntaria.getNumeroDeHojas());
            System.out.println("Fecha En la que se presento la Demanda: "+ demandaJuridisccionVoluntaria.getFechaDePresentacion());
            System.out.println("Codigo de Demanda: "+ demandaJuridisccionVoluntaria.getCodigo());
            System.out.println("JurisdicccionVoluntaria: "+ demandaJuridisccionVoluntaria.getJurisdiccionVoluntaria());
            NumeroDemanda += NumeroDemanda;
        }
        if (a ==false){
            System.out.println("No se encontraron demandas");
        }


    }  //Listo

    public static void buscarDemandaCivil(String CodigoDemanda){
        boolean a = false;
        for (DemandaCivil demandasCivil:DemandasCivil) {
         if (CodigoDemanda.equals(demandasCivil.getCodigo())){
             a=true;
             System.out.println("Cliente: " + demandasCivil.getCliente().getNombre()+" "+demandasCivil.getCliente().getApellido() );
             System.out.println("Juzgado numero: " + demandasCivil.getJuzgado().getNumeroJuzgado());
             System.out.println("Trabajador: " + demandasCivil.getTrabajador().getNombre()+ " "+ demandasCivil.getTrabajador().getApellido() + " Clave Identificador: "+ demandasCivil.getTrabajador().getClaveIdentificador());
             System.out.println("Municipio: "+demandasCivil.getMunicipio());
             System.out.println("Ramo: "+ demandasCivil.getRamo());
             System.out.println("Tipo de Juicio: " + demandasCivil.getTipoDeJuicio());
             System.out.println("Hojas de la Demanda: "+ demandasCivil.getNumeroDeHojas());
             System.out.println("Fecha En la que se presento la Demanda: "+ demandasCivil.getFechaDePresentacion());
             System.out.println("Codigo de Demanda: "+ demandasCivil.getCodigo());
             System.out.println("Persona Demandada: "+ demandasCivil.getNombreDemandado()+ " "+demandasCivil.getApellidoDemandado());
         }
        }
        if (a ==false){
            System.out.println("No se encontro la demanda");
        }

    }
    public static void buscarDemandaMercantil(String CodigoDemanda){
        boolean a = false;
        for (DemandaMercantil demandaMercantil:DemandasMercantil) {
            if (CodigoDemanda.equals(demandaMercantil.getCodigo())){
                System.out.println("Cliente: " + demandaMercantil.getCliente().getNombre()+" "+demandaMercantil.getCliente().getApellido() );
                System.out.println("Juzgado numero: " + demandaMercantil.getJuzgado().getNumeroJuzgado());
                System.out.println("Trabajador: " + demandaMercantil.getTrabajador().getNombre()+ " "+ demandaMercantil.getTrabajador().getApellido() + " Clave Identificador: "+ demandaMercantil.getTrabajador().getClaveIdentificador());
                System.out.println("Municipio: "+demandaMercantil.getMunicipio());
                System.out.println("Ramo: "+ demandaMercantil.getRamo());
                System.out.println("Tipo de Juicio: " + demandaMercantil.getTipoDeJuicio());
                System.out.println("Hojas de la Demanda: "+ demandaMercantil.getNumeroDeHojas());
                System.out.println("Fecha En la que se presento la Demanda: "+ demandaMercantil.getFechaDePresentacion());
                System.out.println("Codigo de Demanda: "+ demandaMercantil.getCodigo());
                System.out.println("Persona Demandada: "+ demandaMercantil.getEmpresaDemandada());

            }
        }
        if (a ==false){
            System.out.println("No se encontro la demanda");
        }
    }
    public static void buscarJuridisccionVoluntaria(String CodigoDemanda){
        boolean a = false;
        for (DemandaJuridisccionVoluntaria demandaJuridisccionVoluntaria :DemandasJurisdiccionVoluntaria) {
            if (CodigoDemanda.equals(demandaJuridisccionVoluntaria.getCodigo())){
                System.out.println("Cliente: " + demandaJuridisccionVoluntaria.getCliente().getNombre()+" "+ demandaJuridisccionVoluntaria.getCliente().getApellido() );
                System.out.println("Juzgado numero: " + demandaJuridisccionVoluntaria.getJuzgado().getNumeroJuzgado());
                System.out.println("Trabajador: " + demandaJuridisccionVoluntaria.getTrabajador().getNombre()+ " "+ demandaJuridisccionVoluntaria.getTrabajador().getApellido() + " Clave Identificador: "+ demandaJuridisccionVoluntaria.getTrabajador().getClaveIdentificador());
                System.out.println("Municipio: "+ demandaJuridisccionVoluntaria.getMunicipio());
                System.out.println("Ramo: "+ demandaJuridisccionVoluntaria.getRamo());
                System.out.println("Tipo de Juicio: " + demandaJuridisccionVoluntaria.getTipoDeJuicio());
                System.out.println("Hojas de la Demanda: "+ demandaJuridisccionVoluntaria.getNumeroDeHojas());
                System.out.println("Fecha En la que se presento la Demanda: "+ demandaJuridisccionVoluntaria.getFechaDePresentacion());
                System.out.println("Codigo de Demanda: "+ demandaJuridisccionVoluntaria.getCodigo());
                System.out.println("JurisdicccionVoluntaria: "+ demandaJuridisccionVoluntaria.getJurisdiccionVoluntaria());

            }
        }
        if (a ==false){
            System.out.println("No se encontro la demanda");
        }
    }

    public static int validarNumero2Parametros(int numeroMenor, int numeroMayor, int numeroComparar){
        while (numeroComparar<=numeroMenor || numeroComparar >= numeroMayor ){
            System.out.println("Ingresa un opcion Valida");
            numeroComparar=new Scanner(System.in).nextInt();
        }
        return numeroComparar;
    }

}

      
               
