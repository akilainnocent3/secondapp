package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.enter.password.EnterPasswordViewModel$blockDevice$1", f = "EnterPasswordViewModel.kt", l = {416}, m = "invokeSuspend", v = 2)
public final class i9g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ p9g b;
    public final /* synthetic */ String c;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a implements lyh<Unit> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ p9g b;

        /* JADX INFO: renamed from: i9g$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes6.dex */
        @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.enter.password.EnterPasswordViewModel$blockDevice$1$invokeSuspend$$inlined$collectAsResult$1", f = "EnterPasswordViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0670a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0670a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        /* JADX INFO: loaded from: classes6.dex */
        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ p9g b;

            /* JADX INFO: renamed from: i9g$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.enter.password.EnterPasswordViewModel$blockDevice$1$invokeSuspend$$inlined$collectAsResult$1$2", f = "EnterPasswordViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0671a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0671a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, p9g p9gVar) {
                this.a = myhVar;
                this.b = p9gVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x001b  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0671a c0671a;
                Object value;
                Object value2;
                Object value3;
                p9g p9gVar = this.b;
                wwd0 wwd0Var = p9gVar.w;
                if (v1bVar instanceof C0671a) {
                    c0671a = (C0671a) v1bVar;
                    int i = c0671a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0671a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0671a = new C0671a(v1bVar);
                    }
                } else {
                    c0671a = new C0671a(v1bVar);
                }
                Object obj2 = c0671a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0671a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.c) {
                        do {
                            value3 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value3, h9g.a((h9g) value3, null, null, null, uxs.ENABLE, false, null, 55)));
                        p9gVar.z.a(new e9g.c(new ResourceUiText(R.string.device_management__successfully_block_device)));
                        p9gVar.f.a(pa.a, k00.d);
                    } else if (lk50Var instanceof lk50.a) {
                        SprThrowable sprThrowableH = bm50.h((lk50.a) lk50Var);
                        UiText uiTextB = sprThrowableH != null ? sprThrowableH.b() : vch0.b;
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, h9g.a((h9g) value2, null, null, uiTextB, uxs.ENABLE, false, null, 51)));
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
                    c0671a.b = 1;
                    if (this.a.emit(unit, c0671a) == y5bVar) {
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

        public a(lyh lyhVar, p9g p9gVar) {
            this.a = lyhVar;
            this.b = p9gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
            C0670a c0670a;
            if (v1bVar instanceof C0670a) {
                c0670a = (C0670a) v1bVar;
                int i = c0670a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0670a.b = i - Integer.MIN_VALUE;
                } else {
                    c0670a = new C0670a(v1bVar);
                }
            } else {
                c0670a = new C0670a(v1bVar);
            }
            Object obj = c0670a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0670a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0670a.b = 1;
                if (this.a.collect(bVar, c0670a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a(lTGEJfVytU.eLNKEEazM);
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9g(p9g p9gVar, String str, v1b<? super i9g> v1bVar) {
        super(2, v1bVar);
        this.b = p9gVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i9g(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i9g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            p9g p9gVar = this.b;
            String str = p9gVar.v;
            if (str == null) {
                itf0.a.d("BlockDevice: deviceId is null", new Object[0]);
                wwd0 wwd0Var = p9gVar.w;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, h9g.a((h9g) value, null, null, vch0.b, uxs.ENABLE, false, null, 51)));
                return Unit.a;
            }
            a aVar = new a(p9gVar.c.g(this.c, str), p9gVar);
            this.a = 1;
            if (kzh.a(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
