package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.enter.password.EnterPasswordViewModel$logoutOtherDevices$1", f = "EnterPasswordViewModel.kt", l = {411}, m = "invokeSuspend", v = 2)
public final class l9g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ p9g b;
    public final /* synthetic */ String c;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a implements lyh<Unit> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ p9g b;

        /* JADX INFO: renamed from: l9g$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes6.dex */
        @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.enter.password.EnterPasswordViewModel$logoutOtherDevices$1$invokeSuspend$$inlined$collectAsResult$1", f = "EnterPasswordViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0806a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0806a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: l9g$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.enter.password.EnterPasswordViewModel$logoutOtherDevices$1$invokeSuspend$$inlined$collectAsResult$1$2", f = "EnterPasswordViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0807a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0807a(v1b v1bVar) {
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
                C0807a c0807a;
                Object value;
                Object value2;
                Object value3;
                p9g p9gVar = this.b;
                wwd0 wwd0Var = p9gVar.w;
                if (v1bVar instanceof C0807a) {
                    c0807a = (C0807a) v1bVar;
                    int i = c0807a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0807a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0807a = new C0807a(v1bVar);
                    }
                } else {
                    c0807a = new C0807a(v1bVar);
                }
                Object obj2 = c0807a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0807a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.c) {
                        do {
                            value3 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value3, h9g.a((h9g) value3, null, null, null, uxs.ENABLE, false, null, 55)));
                        p9gVar.z.a(new e9g.c(new ResourceUiText(R.string.device_management__successfully_logged_out)));
                        p9gVar.f.a(ra.a, k00.d);
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
                    c0807a.b = 1;
                    if (this.a.emit(unit, c0807a) == y5bVar) {
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
            C0806a c0806a;
            if (v1bVar instanceof C0806a) {
                c0806a = (C0806a) v1bVar;
                int i = c0806a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0806a.b = i - Integer.MIN_VALUE;
                } else {
                    c0806a = new C0806a(v1bVar);
                }
            } else {
                c0806a = new C0806a(v1bVar);
            }
            Object obj = c0806a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0806a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0806a.b = 1;
                if (this.a.collect(bVar, c0806a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a(tYcQsJyaojE.vwvBxUaootp);
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9g(p9g p9gVar, String str, v1b<? super l9g> v1bVar) {
        super(2, v1bVar);
        this.b = p9gVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l9g(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l9g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            p9g p9gVar = this.b;
            a aVar = new a(p9gVar.c.b(this.c), p9gVar);
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
