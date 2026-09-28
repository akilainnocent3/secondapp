package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface omn {

    public static final class a implements omn {
        public final ijf0 a;
        public final String b;

        public a(ijf0 ijf0Var) {
            this.a = ijf0Var;
            this.b = ijf0Var.a.b;
        }

        @Override // defpackage.omn
        public final boolean a() {
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        @Override // defpackage.omn
        public final String getText() {
            return this.b;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Editable(amount=" + this.a + ')';
        }
    }

    public static final class b implements omn {
        public final String a;
        public final String b;

        public b(String str) {
            str.getClass();
            this.a = str;
            this.b = str;
        }

        @Override // defpackage.omn
        public final boolean a() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        @Override // defpackage.omn
        public final String getText() {
            return this.b;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return j26.a(new StringBuilder("NonEditable(amount="), this.a, ')');
        }
    }

    boolean a();

    String getText();
}
