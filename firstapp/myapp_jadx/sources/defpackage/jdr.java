package defpackage;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public interface jdr {
    public static final a Companion = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final php<jdr> serializer() {
            return new nt70("com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffSubDestination", jq40.a(jdr.class), new ygp[]{jq40.a(b.class), jq40.a(c.class)}, new php[]{new mcy("com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffSubDestination.Main", b.INSTANCE, new Annotation[0]), c.a.a}, new Annotation[0]);
        }
    }

    @ae80
    public static final class b implements jdr {
        public static final b INSTANCE = new b();
        public static final /* synthetic */ ttr<php<Object>> a = hwr.a(a1s.b, new kdr());

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 736309757;
        }

        public final php<b> serializer() {
            return (php) a.getValue();
        }

        public final String toString() {
            return "Main";
        }
    }

    @ae80
    public static final class c implements jdr {
        public static final b Companion = new b();
        public final String a;

        @fae
        public static final /* synthetic */ class a implements o1k<c> {
            public static final a a;
            private static final pd80 descriptor;

            static {
                a aVar = new a();
                a = aVar;
                kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffSubDestination.ZoomInDialog", aVar, 1);
                kr10Var.j("localImageUrl", false);
                descriptor = kr10Var;
            }

            @Override // defpackage.o1k
            public final php<?>[] childSerializers() {
                return new php[]{gae0.a};
            }

            @Override // defpackage.tae
            public final Object deserialize(b5d b5dVar) {
                pd80 pd80Var = descriptor;
                dma dmaVarC = b5dVar.c(pd80Var);
                boolean z = true;
                int i = 0;
                String strJ = null;
                while (z) {
                    int iV = dmaVarC.v(pd80Var);
                    if (iV == -1) {
                        z = false;
                    } else {
                        if (iV != 0) {
                            jtf0.a(iV);
                            return null;
                        }
                        strJ = dmaVarC.j(pd80Var, 0);
                        i = 1;
                    }
                }
                dmaVarC.b(pd80Var);
                return new c(i, strJ);
            }

            @Override // defpackage.he80, defpackage.tae
            public final pd80 getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.he80
            public final void serialize(f4g f4gVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                pd80 pd80Var = descriptor;
                fma fmaVarC = f4gVar.c(pd80Var);
                fmaVarC.o(pd80Var, 0, cVar.a);
                fmaVarC.b(pd80Var);
            }
        }

        public static final class b {
            public final php<c> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ c(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                cgo.a(i, 1, a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("ZoomInDialog(localImageUrl=", this.a, ")");
        }

        public c(String str) {
            str.getClass();
            this.a = str;
        }
    }
}
