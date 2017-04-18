package edu.buffalo.cse.cse486586.simpledht;

/**
 * Class for contsant Values
 * Created by vipin on 4/9/17.
 */

public final class Constants {
    // For Client Socket Communications
    public static final String OK = "OK";
    public static final String SYN = "SYN";
    public static final String ACK = "ACK";
    public static final String STOP = "STOP";
    public static final String SYNACK = "SYNACK";
    public static final String STOPPED = "STOPPED";

    // For Different Delimiters
    public static final String DELIM = "@#@";
    public static final String DATADELIM = "@##@";
    public static final String DATASEPDELIM = "@###@";

    // For Message types and Communications

    public static final String JOIN = "JOIN";
    public static final String QUERYALL = "*";
    public static final String QUERY = "QUERY";
    public static final String DELETE = "DELETE";
    public static final String INSERT = "INSERT";
    public static final String QUERYLOCALALL = "@";
    public static final String NULLVALUE = "NULLVALUE";
    public static final String JOINUPDATE = "JOINUPDATE";
    public static final String INSERTFINAL = "INSERTFINAL";
    public static final String QUERYRESULT = "QUERYRESULT";
    public static final String DELETERESULT = "DELETERESULT";

}
