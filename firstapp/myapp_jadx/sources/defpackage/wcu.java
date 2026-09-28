package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel$resendEmail$1", f = "MFAViewModel.kt", l = {422}, m = "invokeSuspend", v = 2)
public final class wcu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ocu b;

    @c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel$resendEmail$1$1", f = "MFAViewModel.kt", l = {422}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ocu b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ocu ocuVar, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.b = ocuVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                oyf oyfVar = this.b.f;
                this.a = 1;
                if (oyfVar.c(this) == y5bVar) {
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

    public static final class b<T> implements myh {
        public final /* synthetic */ ocu a;

        @c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel$resendEmail$1$2", f = "MFAViewModel.kt", l = {425}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ b<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, v1b<? super a> v1bVar) {
                super(v1bVar);
                this.b = bVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        public b(ocu ocuVar) {
            this.a = ocuVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(lk50<Unit> lk50Var, v1b<? super Unit> v1bVar) {
            a aVar;
            Object value;
            o9w aVar2;
            Object value2;
            Object value3;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.c = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, v1bVar);
                }
            } else {
                aVar = new a(this, v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.c;
            ocu ocuVar = this.a;
            if (i2 == 0) {
                uj50.b(obj);
                if (lk50Var instanceof lk50.c) {
                    ku90<u9w> ku90Var = ocuVar.E;
                    StringUiText stringUiText = vch0.a;
                    u9w.a aVar3 = new u9w.a(new ResourceUiText(R.string.common_feedback__successfully_sent));
                    aVar.c = 1;
                    if (ku90Var.a.emit(aVar3, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else if (lk50Var instanceof lk50.a) {
                    SprThrowable sprThrowableH = bm50.h(lk50Var);
                    if (sprThrowableH == null) {
                        aVar2 = o9w.b.a;
                    } else if (sprThrowableH.getD() == 18208) {
                        StringUiText stringUiText2 = vch0.a;
                        aVar2 = new o9w.a(new ResourceUiText(R.string.email_change__email_request_limit_title), sprThrowableH.b());
                    } else {
                        StringUiText stringUiText3 = vch0.a;
                        aVar2 = new o9w.a(new ResourceUiText(R.string.common_functions__error), sprThrowableH.b());
                    }
                    o9w o9wVar = aVar2;
                    wwd0 wwd0Var = ocuVar.C;
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, oaw.a((oaw) value2, null, false, false, null, o9wVar, 15)));
                } else {
                    if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                        uhc.a();
                        return null;
                    }
                    wwd0 wwd0Var2 = ocuVar.C;
                    do {
                        value = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value, oaw.a((oaw) value, null, false, false, null, o9w.c.a, 15)));
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            wwd0 wwd0Var3 = ocuVar.C;
            do {
                value3 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value3, oaw.a((oaw) value3, null, false, false, null, null, 15)));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcu(ocu ocuVar, v1b<? super wcu> v1bVar) {
        super(2, v1bVar);
        this.b = ocuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wcu(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wcu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ocu ocuVar = this.b;
            or60 or60VarO = bm50.o(new a(ocuVar, null));
            b bVar = new b(ocuVar);
            this.a = 1;
            if (or60VarO.collect(bVar, this) == y5bVar) {
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
