package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class kae0 {
    public static final a a = new a();

    public static final class a extends kae0 {
        public final int a(CharSequence charSequence, CharSequence charSequence2, int i) {
            if (charSequence == null || charSequence2 == null) {
                return -1;
            }
            if (charSequence instanceof String) {
                return ((String) charSequence).indexOf(charSequence2.toString(), i);
            }
            if (charSequence instanceof StringBuilder) {
                return ((StringBuilder) charSequence).indexOf(charSequence2.toString(), i);
            }
            return charSequence instanceof StringBuffer ? ((StringBuffer) charSequence).indexOf(charSequence2.toString(), i) : ((String) charSequence).toString().indexOf(charSequence2.toString(), i);
        }
    }
}
