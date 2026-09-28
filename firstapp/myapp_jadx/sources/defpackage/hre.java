package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hre {
    public static final a a = new a();
    public static final b b = new b();
    public static final c c = new c();
    public static final e d;

    public class a extends hre {
        @Override // defpackage.hre
        public final boolean a() {
            return true;
        }

        @Override // defpackage.hre
        public final boolean b() {
            return true;
        }

        @Override // defpackage.hre
        public final boolean c(cqc cqcVar) {
            return cqcVar == cqc.b;
        }

        @Override // defpackage.hre
        public final boolean d(boolean z, cqc cqcVar, c4g c4gVar) {
            return (cqcVar == cqc.d || cqcVar == cqc.e) ? false : true;
        }
    }

    public class b extends hre {
        @Override // defpackage.hre
        public final boolean a() {
            return false;
        }

        @Override // defpackage.hre
        public final boolean b() {
            return false;
        }

        @Override // defpackage.hre
        public final boolean c(cqc cqcVar) {
            return false;
        }

        @Override // defpackage.hre
        public final boolean d(boolean z, cqc cqcVar, c4g c4gVar) {
            return false;
        }
    }

    public class c extends hre {
        @Override // defpackage.hre
        public final boolean a() {
            return true;
        }

        @Override // defpackage.hre
        public final boolean b() {
            return false;
        }

        @Override // defpackage.hre
        public final boolean c(cqc cqcVar) {
            return (cqcVar == cqc.c || cqcVar == cqc.e) ? false : true;
        }

        @Override // defpackage.hre
        public final boolean d(boolean z, cqc cqcVar, c4g c4gVar) {
            return false;
        }
    }

    public class d extends hre {
        @Override // defpackage.hre
        public final boolean a() {
            return false;
        }

        @Override // defpackage.hre
        public final boolean b() {
            return true;
        }

        @Override // defpackage.hre
        public final boolean c(cqc cqcVar) {
            return false;
        }

        @Override // defpackage.hre
        public final boolean d(boolean z, cqc cqcVar, c4g c4gVar) {
            return (cqcVar == cqc.d || cqcVar == cqc.e) ? false : true;
        }
    }

    public class e extends hre {
        @Override // defpackage.hre
        public final boolean a() {
            return true;
        }

        @Override // defpackage.hre
        public final boolean b() {
            return true;
        }

        @Override // defpackage.hre
        public final boolean c(cqc cqcVar) {
            return cqcVar == cqc.b;
        }

        @Override // defpackage.hre
        public final boolean d(boolean z, cqc cqcVar, c4g c4gVar) {
            return ((z && cqcVar == cqc.c) || cqcVar == cqc.a) && c4gVar == c4g.b;
        }
    }

    static {
        new d();
        d = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(cqc cqcVar);

    public abstract boolean d(boolean z, cqc cqcVar, c4g c4gVar);
}
