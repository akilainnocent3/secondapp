package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class mq40 {
    public static String a(qaj qajVar) {
        String string = qajVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
