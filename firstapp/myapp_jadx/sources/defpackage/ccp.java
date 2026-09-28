package defpackage;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ccp implements php<acp> {
    public static final ccp a = new ccp();
    public static final a b = a.b;

    public static final class a implements pd80 {
        public static final a b = new a();
        public static final String c = "kotlinx.serialization.json.JsonArray";
        public final /* synthetic */ lx0 a;

        public a() {
            pd80 descriptor = adp.a.getDescriptor();
            descriptor.getClass();
            this.a = new lx0(descriptor);
        }

        @Override // defpackage.pd80
        public final boolean b() {
            return false;
        }

        @Override // defpackage.pd80
        public final int c(String str) {
            str.getClass();
            return this.a.c(str);
        }

        @Override // defpackage.pd80
        public final int d() {
            return 1;
        }

        @Override // defpackage.pd80
        public final String e(int i) {
            return String.valueOf(i);
        }

        @Override // defpackage.pd80
        public final List<Annotation> f(int i) {
            return this.a.f(i);
        }

        @Override // defpackage.pd80
        public final pd80 g(int i) {
            return this.a.g(i);
        }

        @Override // defpackage.pd80
        public final List<Annotation> getAnnotations() {
            return m2g.a;
        }

        @Override // defpackage.pd80
        public final yd80 getKind() {
            return ebe0.b.a;
        }

        @Override // defpackage.pd80
        public final String h() {
            return c;
        }

        @Override // defpackage.pd80
        public final boolean i(int i) {
            this.a.i(i);
            return false;
        }

        @Override // defpackage.pd80
        public final boolean isInline() {
            return false;
        }
    }

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        cdp.a(b5dVar);
        return new acp((List) new mx0(adp.a).e(b5dVar));
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        acp acpVar = (acp) obj;
        acpVar.getClass();
        cdp.b(f4gVar);
        adp adpVar = adp.a;
        pd80 descriptor = adpVar.getDescriptor();
        descriptor.getClass();
        lx0 lx0Var = new lx0(descriptor);
        int size = acpVar.size();
        fma fmaVarS = f4gVar.s(lx0Var, size);
        Iterator<scp> it = acpVar.iterator();
        for (int i = 0; i < size; i++) {
            fmaVarS.q(lx0Var, i, adpVar, it.next());
        }
        fmaVarS.b(lx0Var);
    }
}
