package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class oih implements lyh<p800> {
    public final /* synthetic */ vl50 a;
    public final /* synthetic */ rih b;

    @c0d(c = "com.sportybet.feature.footer.impl.domain.usecase.FetchPaymentProvidersUseCase$fetchFromCms$$inlined$map$1", f = "FetchPaymentProvidersUseCase.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return oih.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ rih b;

        @c0d(c = "com.sportybet.feature.footer.impl.domain.usecase.FetchPaymentProvidersUseCase$fetchFromCms$$inlined$map$1$2", f = "FetchPaymentProvidersUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, rih rihVar) {
            this.a = myhVar;
            this.b = rihVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x005f  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            boolean z;
            int i;
            psm psmVar = (psm) this.b.a;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i2 = aVar.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.b = i2 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i3 = aVar.b;
            if (i3 == 0) {
                uj50.b(obj2);
                List listR0 = CollectionsKt.r0((List) obj, new pih());
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listR0.iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    String value = ((CMSResponse) it.next()).getValue();
                    if (value == null) {
                        value = null;
                    } else if (!c.u(value, "http", false)) {
                        if (c.u(value, "//", false)) {
                            value = "https:".concat(value);
                        } else {
                            value = null;
                        }
                    }
                    if (value != null) {
                        arrayList.add(value);
                    }
                }
                if (!psmVar.x() && !psmVar.n() && !psmVar.o() && !psmVar.G()) {
                    z = true;
                }
                List listC = psmVar.C(arrayList);
                if (psmVar.F()) {
                    i = 2;
                } else {
                    i = z ? 4 : 3;
                }
                p800 p800Var = new p800(i, listC, z);
                aVar.b = 1;
                if (this.a.emit(p800Var, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public oih(vl50 vl50Var, rih rihVar) {
        this.a = vl50Var;
        this.b = rihVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super p800> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
