package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.net.ConnectException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.presentation.redeemcode.RedeemCodeViewModel$redeemGift$1", f = "RedeemCodeViewModel.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class op40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ pp40 b;
    public final /* synthetic */ String c;

    public static final class a<T> implements myh {
        public final /* synthetic */ pp40 a;

        /* JADX INFO: renamed from: op40$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.gift.gift.presentation.redeemcode.RedeemCodeViewModel$redeemGift$1$1", f = "RedeemCodeViewModel.kt", l = {61, 62, 67}, m = "emit", v = 2)
        public static final class C0948a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0948a(a<? super T> aVar, v1b<? super C0948a> v1bVar) {
                super(v1bVar);
                this.b = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        public a(pp40 pp40Var) {
            this.a = pp40Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(lk50<eik> lk50Var, v1b<? super Unit> v1bVar) {
            C0948a c0948a;
            Object value;
            Object objJ;
            Object value2;
            Object value3;
            Object value4;
            if (v1bVar instanceof C0948a) {
                c0948a = (C0948a) v1bVar;
                int i = c0948a.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0948a.c = i - Integer.MIN_VALUE;
                } else {
                    c0948a = new C0948a(this, v1bVar);
                }
            } else {
                c0948a = new C0948a(this, v1bVar);
            }
            Object obj = c0948a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0948a.c;
            pp40 pp40Var = this.a;
            if (i2 == 0) {
                uj50.b(obj);
                if (lk50Var instanceof lk50.b) {
                    wwd0 wwd0Var = pp40Var.b;
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, np40.a((np40) value4, null, true, null, 5)));
                    return Unit.a;
                }
                if (lk50Var instanceof lk50.c) {
                    wwd0 wwd0Var2 = pp40Var.b;
                    do {
                        value3 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value3, np40.a((np40) value3, null, false, null, 1)));
                    tb5 tb5Var = pp40Var.d;
                    bp40.d dVar = bp40.d.a;
                    c0948a.c = 1;
                    if (tb5Var.j(c0948a, dVar) != y5bVar) {
                    }
                } else {
                    if (!(lk50Var instanceof lk50.a)) {
                        uhc.a();
                        return null;
                    }
                    wwd0 wwd0Var3 = pp40Var.b;
                    do {
                        value = wwd0Var3.getValue();
                    } while (!wwd0Var3.g(value, np40.a((np40) value, null, false, null, 5)));
                    lk50.a aVar = (lk50.a) lk50Var;
                    Throwable th = aVar.a;
                    UiText resourceUiText = aVar.b;
                    c0948a.c = 3;
                    tb5 tb5Var2 = pp40Var.d;
                    if ((th instanceof ConnectException) || (th instanceof UnknownHostException)) {
                        objJ = tb5Var2.j(c0948a, bp40.c.a);
                    } else {
                        boolean z = th instanceof SprThrowable;
                        if (z && ((SprThrowable) th).getD() == 73300) {
                            objJ = tb5Var2.j(c0948a, new bp40.b(resourceUiText));
                        } else if (z) {
                            if ((resourceUiText instanceof StringUiText) && ((StringUiText) resourceUiText).a.length() <= 0) {
                                StringUiText stringUiText = vch0.a;
                                resourceUiText = new ResourceUiText(R.string.gift__redeem_code_error_message);
                            }
                            wwd0 wwd0Var4 = pp40Var.b;
                            do {
                                value2 = wwd0Var4.getValue();
                            } while (!wwd0Var4.g(value2, np40.a((np40) value2, null, false, resourceUiText, 3)));
                            objJ = Unit.a;
                        } else {
                            StringUiText stringUiText2 = vch0.a;
                            objJ = tb5Var2.j(c0948a, new bp40.b(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later)));
                        }
                    }
                    if (objJ != y5bVar) {
                        return objJ;
                    }
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    uj50.b(obj);
                    return obj;
                }
                if (i2 == 3) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            tb5 tb5Var3 = pp40Var.d;
            bp40.a aVar2 = bp40.a.a;
            c0948a.c = 2;
            Object objJ2 = tb5Var3.j(c0948a, aVar2);
            return objJ2 == y5bVar ? y5bVar : objJ2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op40(pp40 pp40Var, String str, v1b<? super op40> v1bVar) {
        super(2, v1bVar);
        this.b = pp40Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new op40(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((op40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pp40 pp40Var = this.b;
            lyh<lk50<eik>> lyhVarD = pp40Var.a.d(this.c);
            a aVar = new a(pp40Var);
            this.a = 1;
            if (lyhVarD.collect(aVar, this) == y5bVar) {
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
