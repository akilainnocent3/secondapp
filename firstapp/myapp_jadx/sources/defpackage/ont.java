package defpackage;

import androidx.compose.runtime.m;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ont implements nnt {
    public final dm8 a = em8.a();
    public final ytw b = m.b(null);
    public final ytw c = m.b(null);
    public final mae d = a6a0.b(new c());
    public final mae e = a6a0.b(new a());
    public final mae f = a6a0.b(new b());
    public final mae i = a6a0.b(new d());

    public static final class a extends qlr implements Function0<Boolean> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            ont ontVar = ont.this;
            return Boolean.valueOf((ontVar.getValue() == null && ontVar.e() == null) ? false : true);
        }
    }

    public static final class b extends qlr implements Function0<Boolean> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(ont.this.e() != null);
        }
    }

    public static final class c extends qlr implements Function0<Boolean> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            ont ontVar = ont.this;
            return Boolean.valueOf(ontVar.getValue() == null && ontVar.e() == null);
        }
    }

    public static final class d extends qlr implements Function0<Boolean> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(ont.this.getValue() != null);
        }
    }

    @Override // defpackage.nnt
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    @Override // defpackage.nnt
    public final Throwable e() {
        return (Throwable) ((x5a0) this.c).getValue();
    }

    @Override // defpackage.twd0
    public final xmt getValue() {
        return (xmt) ((x5a0) this.b).getValue();
    }
}
