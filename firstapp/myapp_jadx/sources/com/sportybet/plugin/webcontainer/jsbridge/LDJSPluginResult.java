package com.sportybet.plugin.webcontainer.jsbridge;

import android.util.Base64;
import defpackage.hce0;
import defpackage.he;
import defpackage.mq0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class LDJSPluginResult {
    public static final int MESSAGE_TYPE_ARRAYBUFFER = 6;
    public static final int MESSAGE_TYPE_BINARYSTRING = 7;
    public static final int MESSAGE_TYPE_BOOLEAN = 4;
    public static final int MESSAGE_TYPE_JSON = 2;
    public static final int MESSAGE_TYPE_NULL = 5;
    public static final int MESSAGE_TYPE_NUMBER = 3;
    public static final int MESSAGE_TYPE_STRING = 1;
    public static String[] StatusMessages = {"No result", "OK", "Class not found", "Illegal access", "Instantiation error", "Malformed url", "IO error", "Invalid action", "JSON error", "Error"};
    private String encodedMessage;
    private boolean keepCallback;
    private final int messageType;
    private final int status;
    private String strMessage;

    public enum Status {
        NO_RESULT,
        OK,
        CLASS_NOT_FOUND_EXCEPTION,
        ILLEGAL_ACCESS_EXCEPTION,
        INSTANTIATION_EXCEPTION,
        MALFORMED_URL_EXCEPTION,
        IO_EXCEPTION,
        INVALID_ACTION,
        JSON_EXCEPTION,
        ERROR
    }

    public LDJSPluginResult(Status status, float f) {
        this.keepCallback = false;
        this.status = status.ordinal();
        this.messageType = 3;
        this.encodedMessage = "" + f;
    }

    public String getJSONString() {
        StringBuilder sb = new StringBuilder("{\"status\":");
        sb.append(this.status);
        sb.append(",\"message\":");
        sb.append(getMessage());
        sb.append(",\"keepCallback\":");
        return mq0.a(sb, this.keepCallback, "}");
    }

    public boolean getKeepCallback() {
        return this.keepCallback;
    }

    public String getMessage() {
        String str = this.encodedMessage;
        if (str != null) {
            return str;
        }
        String strQuote = JSONObject.quote(this.strMessage);
        this.encodedMessage = strQuote;
        return strQuote;
    }

    public int getMessageType() {
        return this.messageType;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStrMessage() {
        return this.strMessage;
    }

    public void setKeepCallback(boolean z) {
        this.keepCallback = z;
    }

    public String toCallbackString(String str) {
        int i = this.status;
        Status status = Status.NO_RESULT;
        if (i == status.ordinal() && this.keepCallback) {
            return null;
        }
        return (this.status == Status.OK.ordinal() || this.status == status.ordinal()) ? toSuccessCallbackString(str) : toErrorCallbackString(str);
    }

    public String toErrorCallbackString(String str) {
        StringBuilder sbA = he.a("cordova.callbackError('", str, "', ");
        sbA.append(getJSONString());
        sbA.append(");");
        return sbA.toString();
    }

    public String toSuccessCallbackString(String str) {
        StringBuilder sbA = he.a("cordova.callbackSuccess('", str, "',");
        sbA.append(getJSONString());
        sbA.append(");");
        return sbA.toString();
    }

    public LDJSPluginResult(Status status, String str) {
        this.keepCallback = false;
        this.status = status.ordinal();
        this.messageType = str == null ? 5 : 1;
        this.strMessage = str;
    }

    public LDJSPluginResult(Status status, JSONArray jSONArray) {
        this.keepCallback = false;
        this.status = status.ordinal();
        this.messageType = 2;
        this.encodedMessage = jSONArray.toString();
    }

    public LDJSPluginResult(Status status, JSONObject jSONObject) {
        this.keepCallback = false;
        this.status = status.ordinal();
        this.messageType = 2;
        this.encodedMessage = jSONObject.toString();
    }

    public LDJSPluginResult(Status status, int i) {
        this.keepCallback = false;
        this.status = status.ordinal();
        this.messageType = 3;
        this.encodedMessage = hce0.a(i, "");
    }

    public LDJSPluginResult(Status status) {
        this(status, StatusMessages[status.ordinal()]);
    }

    public LDJSPluginResult(Status status, boolean z) {
        this.keepCallback = false;
        this.status = status.ordinal();
        this.messageType = 4;
        this.encodedMessage = Boolean.toString(z);
    }

    public LDJSPluginResult(Status status, byte[] bArr) {
        this(status, bArr, false);
    }

    public LDJSPluginResult(Status status, byte[] bArr, boolean z) {
        this.keepCallback = false;
        this.status = status.ordinal();
        this.messageType = z ? 7 : 6;
        this.encodedMessage = Base64.encodeToString(bArr, 2);
    }
}
