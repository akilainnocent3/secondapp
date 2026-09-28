package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k9g implements lyh<Unit> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ p9g b;
    public final /* synthetic */ ResourceUiText c;
    public final /* synthetic */ dge d;

    @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.enter.password.EnterPasswordViewModel$handleUnitResultAction$$inlined$collectAsResult$1", f = "EnterPasswordViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return k9g.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ p9g b;
        public final /* synthetic */ ResourceUiText c;
        public final /* synthetic */ dge d;

        @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.enter.password.EnterPasswordViewModel$handleUnitResultAction$$inlined$collectAsResult$1$2", f = "EnterPasswordViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, p9g p9gVar, ResourceUiText resourceUiText, dge dgeVar) {
            this.a = myhVar;
            this.b = p9gVar;
            this.c = resourceUiText;
            this.d = dgeVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            Object value;
            Object value2;
            p9g p9gVar = this.b;
            rdd0 rdd0Var = p9gVar.f;
            wwd0 wwd0Var = p9gVar.w;
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
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj2);
                lk50 lk50Var = (lk50) obj;
                if (lk50Var instanceof lk50.c) {
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, h9g.a((h9g) value2, null, null, null, uxs.ENABLE, false, null, 55)));
                    p9gVar.z.a(new e9g.c(this.c));
                    dge.b bVar = dge.b.a;
                    dge dgeVar = this.d;
                    if (Intrinsics.g(dgeVar, bVar)) {
                        rdd0Var.a(ta.a, k00.d);
                    } else if (Intrinsics.g(dgeVar, dge.d.a)) {
                        rdd0Var.a(va.a, k00.d);
                    }
                } else if (lk50Var instanceof lk50.a) {
                    p9gVar.y1((lk50.a) lk50Var);
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, h9g.a((h9g) value, null, null, null, uxs.LOADING, false, null, 55)));
                }
                Unit unit = Unit.a;
                aVar.b = 1;
                if (this.a.emit(unit, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public k9g(lyh lyhVar, p9g p9gVar, ResourceUiText resourceUiText, dge dgeVar) {
        this.a = lyhVar;
        this.b = p9gVar;
        this.c = resourceUiText;
        this.d = dgeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b, this.c, this.d);
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
