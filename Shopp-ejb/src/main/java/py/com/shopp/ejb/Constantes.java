/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.shopp.ejb;

/**
 *
 * @author Luis Galeano
 */
public class Constantes {
    
    public static final String EXITO_MENSAJE = "OK";
    public static final Integer EXITO_ESTADO = 0;
    
    public static final String ERROR_MENSAJE = "ERROR INDETERMINADO";
    public static final Integer ERROR_ESTADO = -1;
    
    public static final String  ERROR_USUARIO= "No existe el usuario";
    public static final String  ERROR_EMAIL= "El email no se encuentra registrado en el sistema";
    public static final String  EXITO_EMAIL= "Se ha enviado un correo electronico para restablecer su contraseña";
    public static final String END_POINT = "keyclaok_admin_url";
    public static final String REALM= "keyclaok_realm_usuarios";
    public static final String GROUP_ID= "keycloak_group_id_usuarios";
    public static final String TOKEN_URL= "keycloak_token_url";
    public static final String REQUEST_BODY= "keycloak_token_body";
    public static final String JNDI_NAME= "java:/MariaDBDS";
    public static final String USER_ID= "sub";
    public static final String USER_NAME= "preferred_username";
    public static final String EMAIL= "email";
    
    public static final String MOVIMIENTOS_URL= "movimientos_del_dia_url";
    public static final String DAT_FINAN_URL= "datos_financiero__url";
    
    public static final Integer DEFAULT_PAGE = 1;
    public static final Integer DEFAULT_COUNT=10;
    
    public static final String EMAIL_NO_ENVIADO= "Ha ocurrido un error. Favor contactar con el administrador.";
    public static final String  ERROR_PASS= "La contraseña actual no coincide";
    public static final String  ERROR_POLICY_PASS= "La contraseña debe contener mínimo 6 caracteres alternando mayúsculas, minúsculas, números y caracteres especiales";
    public static final String CLIENTE= "aud";
    
    public static final String TARIFARIO_URL= "tarifario_url";
    
    public static final String BANCOS_Y_FINANCIERAS= "CA07";
    public static final String COOPERATIVAS= "CA08";
    
    public static final String KEYCLOAK_URL_LOGOUT= "keycloak_url_logout";
    public static final String KEYCLOAK_CLIENT_ID= "keycloak_public_client_id_usuarios";
    
    public static final String REMITENTE= "remitente_notificacion_extractos";
    public static final String ASUNTO= "asunto_notificacion_extractos";
    public static final String MENSAJE= "mensaje_notificacion_extractos";
    
    public static final String CI_NO_REGISTRADO= "mensaje_ci_no_registrado";
    public static final String CI_YA_REGISTRADO_EN_KEYCLOAK= "mensaje_ci_ya_registrado_keycloak";

    public static final String LOGO_ENTIDAD="logo_entidad";
    public static final String LOGO_MARCA="logo_marca";
    
    public static final String MENSAJE_PROCESO_MANUAL="Proceso finalizado";
}
