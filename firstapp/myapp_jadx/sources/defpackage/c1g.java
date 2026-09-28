package defpackage;

import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class c1g {
    public final a a;

    public static class a extends b {
        public final EditText a;
        public final m1g b;

        public a(EditText editText) {
            this.a = editText;
            m1g m1gVar = new m1g(editText);
            this.b = m1gVar;
            editText.addTextChangedListener(m1gVar);
            if (d1g.b == null) {
                synchronized (d1g.a) {
                    try {
                        if (d1g.b == null) {
                            d1g d1gVar = new d1g();
                            try {
                                d1g.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, d1g.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            d1g.b = d1gVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            editText.setEditableFactory(d1g.b);
        }
    }

    public static class b {
    }

    public c1g(EditText editText) {
        this.a = new a(editText);
    }
}
