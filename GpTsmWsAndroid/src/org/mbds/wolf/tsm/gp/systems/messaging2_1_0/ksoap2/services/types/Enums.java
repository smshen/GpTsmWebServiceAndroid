package org.mbds.wolf.tsm.gp.systems.messaging2_1_0.ksoap2.services.types;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 3.0.3.5
//
// Created by amlesas Development at 08-07-2014
//
//---------------------------------------------------





public class Enums
{

    public enum StatusType
    {
        
        EXECUTED_SUCCESS(0),
        
        EXECUTED_WITHWARNING(1),
        
        FAILED(2),
        
        EXPIRED(3);
        
        private int code;
        
        StatusType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static StatusType fromString(String str)
        {
            if (str.equals("EXECUTED_SUCCESS"))
                return EXECUTED_SUCCESS;
            if (str.equals("EXECUTED_WITHWARNING"))
                return EXECUTED_WITHWARNING;
            if (str.equals("FAILED"))
                return FAILED;
            if (str.equals("EXPIRED"))
                return EXPIRED;
		    return null;
        }
    }

    public enum MobileSubscriptionStatusType
    {
        
        SUSPENDED(0),
        
        ACTIVATED(1),
        
        RESTRICTED(2),
        
        TERMINATED(3);
        
        private int code;
        
        MobileSubscriptionStatusType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static MobileSubscriptionStatusType fromString(String str)
        {
            if (str.equals("SUSPENDED"))
                return SUSPENDED;
            if (str.equals("ACTIVATED"))
                return ACTIVATED;
            if (str.equals("RESTRICTED"))
                return RESTRICTED;
            if (str.equals("TERMINATED"))
                return TERMINATED;
		    return null;
        }
    }

    public enum SecureElementStatusType
    {
        
        SUSPENDED(0),
        
        ACTIVATED(1),
        
        TERMINATED(2);
        
        private int code;
        
        SecureElementStatusType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static SecureElementStatusType fromString(String str)
        {
            if (str.equals("SUSPENDED"))
                return SUSPENDED;
            if (str.equals("ACTIVATED"))
                return ACTIVATED;
            if (str.equals("TERMINATED"))
                return TERMINATED;
		    return null;
        }
    }

    public enum ServiceCommandExecutionStatusType
    {
        
        EXECUTED_SUCCESS(0),
        
        EXECUTED_FAILED(1),
        
        NOTEXECUTED(2),
        
        DELIVEREDWITHNORESPONSE(3);
        
        private int code;
        
        ServiceCommandExecutionStatusType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static ServiceCommandExecutionStatusType fromString(String str)
        {
            if (str.equals("EXECUTED_SUCCESS"))
                return EXECUTED_SUCCESS;
            if (str.equals("EXECUTED_FAILED"))
                return EXECUTED_FAILED;
            if (str.equals("NOTEXECUTED"))
                return NOTEXECUTED;
            if (str.equals("DELIVEREDWITHNORESPONSE"))
                return DELIVEREDWITHNORESPONSE;
		    return null;
        }
    }

    public enum ExchangeServiceDataCommandExecutionStatusType
    {
        
        EXECUTED_SUCCESS(0),
        
        EXECUTED_WITHWARNING(1),
        
        EXECUTED_FAILED(2),
        
        NOTEXECUTED(3),
        
        DELIVEREDWITHNORESPONSE(4);
        
        private int code;
        
        ExchangeServiceDataCommandExecutionStatusType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static ExchangeServiceDataCommandExecutionStatusType fromString(String str)
        {
            if (str.equals("EXECUTED_SUCCESS"))
                return EXECUTED_SUCCESS;
            if (str.equals("EXECUTED_WITHWARNING"))
                return EXECUTED_WITHWARNING;
            if (str.equals("EXECUTED_FAILED"))
                return EXECUTED_FAILED;
            if (str.equals("NOTEXECUTED"))
                return NOTEXECUTED;
            if (str.equals("DELIVEREDWITHNORESPONSE"))
                return DELIVEREDWITHNORESPONSE;
		    return null;
        }
    }

    public enum ActionOnServiceExecutionStatusType
    {
        
        EXECUTED_SUCCESS(0),
        
        EXECUTED_FAILED(1),
        
        DELIVEREDWITHNORESPONSE(2);
        
        private int code;
        
        ActionOnServiceExecutionStatusType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static ActionOnServiceExecutionStatusType fromString(String str)
        {
            if (str.equals("EXECUTED_SUCCESS"))
                return EXECUTED_SUCCESS;
            if (str.equals("EXECUTED_FAILED"))
                return EXECUTED_FAILED;
            if (str.equals("DELIVEREDWITHNORESPONSE"))
                return DELIVEREDWITHNORESPONSE;
		    return null;
        }
    }

    public enum CCCMModeType
    {
        
        Scenario_x0020_1_x002D_PK(0,"Scenario 1-PK"),
        
        Scenario_x0020_1_x002D_Non_x0020_PK(1,"Scenario 1-Non PK"),
        
        Scenario_x0020_2A(2,"Scenario 2A"),
        
        Scenario_x0020_2B(3,"Scenario 2B"),
        
        Scenario_x0020_3_x002D_ECC_x002D_256(4,"Scenario 3-ECC-256"),
        
        Scenario_x0020_3_x002D_ECC_x002D_384(5,"Scenario 3-ECC-384"),
        
        Scenario_x0020_3_x002D_ECC_x002D_512(6,"Scenario 3-ECC-512"),
        
        Scenario_x0020_3_x002D_ECC_x002D_521(7,"Scenario 3-ECC-521");
        
        private int code;
        private java.lang.String xmlValue;
        
        CCCMModeType(int code ,java.lang.String xmlValue){
            this.code = code;
            this.xmlValue=xmlValue;
        }
    
        public int getCode(){
		    return code;
	    }
    
        @Override
        public String toString() {
            return xmlValue;
        }

        public static CCCMModeType fromString(String str)
        {
            if (str.equals("Scenario 1-PK"))
                return Scenario_x0020_1_x002D_PK;
            if (str.equals("Scenario 1-Non PK"))
                return Scenario_x0020_1_x002D_Non_x0020_PK;
            if (str.equals("Scenario 2A"))
                return Scenario_x0020_2A;
            if (str.equals("Scenario 2B"))
                return Scenario_x0020_2B;
            if (str.equals("Scenario 3-ECC-256"))
                return Scenario_x0020_3_x002D_ECC_x002D_256;
            if (str.equals("Scenario 3-ECC-384"))
                return Scenario_x0020_3_x002D_ECC_x002D_384;
            if (str.equals("Scenario 3-ECC-512"))
                return Scenario_x0020_3_x002D_ECC_x002D_512;
            if (str.equals("Scenario 3-ECC-521"))
                return Scenario_x0020_3_x002D_ECC_x002D_521;
		    return null;
        }
    }

    public enum KeyGenerationModeType
    {
        
        _1_SECURE_CHANNEL_BASE_KEY(0,"1_SECURE_CHANNEL_BASE_KEY"),
        
        _3_SECURE_CHANNEL_KEY(1,"3_SECURE_CHANNEL_KEY");
        
        private int code;
        private java.lang.String xmlValue;
        
        KeyGenerationModeType(int code ,java.lang.String xmlValue){
            this.code = code;
            this.xmlValue=xmlValue;
        }
    
        public int getCode(){
		    return code;
	    }
    
        @Override
        public String toString() {
            return xmlValue;
        }

        public static KeyGenerationModeType fromString(String str)
        {
            if (str.equals("1_SECURE_CHANNEL_BASE_KEY"))
                return _1_SECURE_CHANNEL_BASE_KEY;
            if (str.equals("3_SECURE_CHANNEL_KEY"))
                return _3_SECURE_CHANNEL_KEY;
		    return null;
        }
    }

    public enum ECCKeyLengthType
    {
        
        ECC_x002D_256(0,"ECC-256"),
        
        ECC_x002D_384(1,"ECC-384"),
        
        ECC_x002D_512(2,"ECC-512"),
        
        ECC_x002D_521(3,"ECC-521");
        
        private int code;
        private java.lang.String xmlValue;
        
        ECCKeyLengthType(int code ,java.lang.String xmlValue){
            this.code = code;
            this.xmlValue=xmlValue;
        }
    
        public int getCode(){
		    return code;
	    }
    
        @Override
        public String toString() {
            return xmlValue;
        }

        public static ECCKeyLengthType fromString(String str)
        {
            if (str.equals("ECC-256"))
                return ECC_x002D_256;
            if (str.equals("ECC-384"))
                return ECC_x002D_384;
            if (str.equals("ECC-512"))
                return ECC_x002D_512;
            if (str.equals("ECC-521"))
                return ECC_x002D_521;
		    return null;
        }
    }

    public enum SEObjectDeletionModeType
    {
        
        DELETE_OBJECT(0),
        
        DELETE_OBJECT_AND_RELATED_OBJECTS(1),
        
        DELETE_ROOT_SD_AND_ASSOCIATED_APPLICATIONS(2);
        
        private int code;
        
        SEObjectDeletionModeType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static SEObjectDeletionModeType fromString(String str)
        {
            if (str.equals("DELETE_OBJECT"))
                return DELETE_OBJECT;
            if (str.equals("DELETE_OBJECT_AND_RELATED_OBJECTS"))
                return DELETE_OBJECT_AND_RELATED_OBJECTS;
            if (str.equals("DELETE_ROOT_SD_AND_ASSOCIATED_APPLICATIONS"))
                return DELETE_ROOT_SD_AND_ASSOCIATED_APPLICATIONS;
		    return null;
        }
    }

    public enum CommandExecutionStatusType
    {
        
        EXECUTED_SUCCESS(0),
        
        EXECUTED_WITHWARNING(1),
        
        EXECUTED_FAILED(2),
        
        NOTEXECUTED(3),
        
        DELIVEREDWITHNORESPONSE(4);
        
        private int code;
        
        CommandExecutionStatusType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static CommandExecutionStatusType fromString(String str)
        {
            if (str.equals("EXECUTED_SUCCESS"))
                return EXECUTED_SUCCESS;
            if (str.equals("EXECUTED_WITHWARNING"))
                return EXECUTED_WITHWARNING;
            if (str.equals("EXECUTED_FAILED"))
                return EXECUTED_FAILED;
            if (str.equals("NOTEXECUTED"))
                return NOTEXECUTED;
            if (str.equals("DELIVEREDWITHNORESPONSE"))
                return DELIVEREDWITHNORESPONSE;
		    return null;
        }
    }

    public enum ScriptFormatType
    {
        
        COMPACT(0),
        
        EXPANDED(1);
        
        private int code;
        
        ScriptFormatType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static ScriptFormatType fromString(String str)
        {
            if (str.equals("COMPACT"))
                return COMPACT;
            if (str.equals("EXPANDED"))
                return EXPANDED;
		    return null;
        }
    }

    public enum SEAuditType
    {
        
        OFFLINE(0),
        
        ONLINE(1);
        
        private int code;
        
        SEAuditType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static SEAuditType fromString(String str)
        {
            if (str.equals("OFFLINE"))
                return OFFLINE;
            if (str.equals("ONLINE"))
                return ONLINE;
		    return null;
        }
    }

    public enum SEApplicationLifeCycleType
    {
        
        INSTALLED(0),
        
        SELECTABLE(1),
        
        APPLICATION_SPECIFIC(2),
        
        LOCKED(3);
        
        private int code;
        
        SEApplicationLifeCycleType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static SEApplicationLifeCycleType fromString(String str)
        {
            if (str.equals("INSTALLED"))
                return INSTALLED;
            if (str.equals("SELECTABLE"))
                return SELECTABLE;
            if (str.equals("APPLICATION_SPECIFIC"))
                return APPLICATION_SPECIFIC;
            if (str.equals("LOCKED"))
                return LOCKED;
		    return null;
        }
    }

    public enum SDLifeCycleType
    {
        
        INSTALLED(0),
        
        SELECTABLE(1),
        
        PERSONALIZED(2),
        
        LOCKED(3);
        
        private int code;
        
        SDLifeCycleType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static SDLifeCycleType fromString(String str)
        {
            if (str.equals("INSTALLED"))
                return INSTALLED;
            if (str.equals("SELECTABLE"))
                return SELECTABLE;
            if (str.equals("PERSONALIZED"))
                return PERSONALIZED;
            if (str.equals("LOCKED"))
                return LOCKED;
		    return null;
        }
    }

    public enum ELFLifeCycleType
    {
        
        LOADED(0);
        
        private int code;
        
        ELFLifeCycleType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static ELFLifeCycleType fromString(String str)
        {
            if (str.equals("LOADED"))
                return LOADED;
		    return null;
        }
    }

    public enum ActionOnDeviceExecutionStatusType
    {
        
        EXECUTED_SUCCESS(0),
        
        EXECUTED_FAILED(1),
        
        DELIVEREDWITHNORESPONSE(2);
        
        private int code;
        
        ActionOnDeviceExecutionStatusType(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static ActionOnDeviceExecutionStatusType fromString(String str)
        {
            if (str.equals("EXECUTED_SUCCESS"))
                return EXECUTED_SUCCESS;
            if (str.equals("EXECUTED_FAILED"))
                return EXECUTED_FAILED;
            if (str.equals("DELIVEREDWITHNORESPONSE"))
                return DELIVEREDWITHNORESPONSE;
		    return null;
        }
    }

}