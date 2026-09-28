package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface anf0<T> {
    static String a(Object obj, String str) {
        Number number;
        String strValueOf;
        String strValueOf2;
        obj.getClass();
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 102) {
                if (iHashCode == 115 && str.equals("s")) {
                    return obj.toString();
                }
            } else if (str.equals("f")) {
                number = obj instanceof Number ? (Number) obj : null;
                return (number == null || (strValueOf2 = String.valueOf(number.floatValue())) == null) ? obj.toString() : strValueOf2;
            }
        } else if (str.equals("d")) {
            number = obj instanceof Number ? (Number) obj : null;
            return (number == null || (strValueOf = String.valueOf(number.intValue())) == null) ? obj.toString() : strValueOf;
        }
        return obj.toString();
    }

    anf0<T> b(String str);

    anf0<T> c(Object obj, String str);

    String d();

    T e();
}
