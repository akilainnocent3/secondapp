package defpackage;

import android.util.Pair;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.search.SocialNetworkSearchViewModel$onFollowAccount$1", f = "SocialNetworkSearchViewModel.kt", l = {169}, m = "invokeSuspend", v = 2)
public final class oea0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rea0 b;
    public final /* synthetic */ String c;

    public static final class a<T> implements myh {
        public final /* synthetic */ rea0 a;
        public final /* synthetic */ String b;

        public a(rea0 rea0Var, String str) {
            this.a = rea0Var;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            mea0 mea0Var;
            ArrayList arrayList;
            Object value2;
            mea0 mea0Var2;
            ArrayList arrayList2;
            Object value3;
            mea0 mea0Var3;
            ArrayList arrayList3;
            lk50 lk50Var = (lk50) obj;
            rea0 rea0Var = this.a;
            wwd0 wwd0Var = rea0Var.a;
            boolean z = lk50Var instanceof lk50.c;
            String str = this.b;
            if (z) {
                do {
                    value3 = wwd0Var.getValue();
                    mea0Var3 = (mea0) value3;
                    qcn<d9a0> qcnVar = mea0Var3.a;
                    arrayList3 = new ArrayList(l48.r(qcnVar, 10));
                    for (d9a0 d9a0VarA : qcnVar) {
                        if (Intrinsics.g(d9a0VarA.a, str)) {
                            d9a0VarA = d9a0.a(d9a0VarA, true, y7i.a.a, 2007);
                        }
                        arrayList3.add(d9a0VarA);
                    }
                } while (!wwd0Var.g(value3, mea0.a(mea0Var3, a4h.f(arrayList3), null, null, false, 62)));
            } else if (lk50Var instanceof lk50.a) {
                w950.a("SocialNetworkSearchViewModel", "SocialNetworkSearchViewModel.onFollowSuggestedAccount", ((lk50.a) lk50Var).a, kotlin.collections.a.c(new Pair("username", str)));
                do {
                    value2 = wwd0Var.getValue();
                    mea0Var2 = (mea0) value2;
                    qcn<d9a0> qcnVar2 = mea0Var2.a;
                    arrayList2 = new ArrayList(l48.r(qcnVar2, 10));
                    for (d9a0 d9a0VarA2 : qcnVar2) {
                        if (Intrinsics.g(d9a0VarA2.a, str)) {
                            d9a0VarA2 = d9a0.a(d9a0VarA2, false, y7i.c.a, 2015);
                        }
                        arrayList2.add(d9a0VarA2);
                    }
                } while (!wwd0Var.g(value2, mea0.a(mea0Var2, a4h.f(arrayList2), null, null, false, 62)));
                SprThrowable sprThrowableH = bm50.h(lk50Var);
                Integer num = sprThrowableH != null ? new Integer(sprThrowableH.getD()) : null;
                if (num != null && num.intValue() == 17001) {
                    rea0Var.x1(lea0.a);
                } else {
                    StringUiText stringUiText = vch0.a;
                    rea0Var.x1(new rb90(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later)));
                }
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var.getValue();
                    mea0Var = (mea0) value;
                    qcn<d9a0> qcnVar3 = mea0Var.a;
                    arrayList = new ArrayList(l48.r(qcnVar3, 10));
                    for (d9a0 d9a0VarA3 : qcnVar3) {
                        if (Intrinsics.g(d9a0VarA3.a, str)) {
                            d9a0VarA3 = d9a0.a(d9a0VarA3, false, y7i.b.a, 2015);
                        }
                        arrayList.add(d9a0VarA3);
                    }
                } while (!wwd0Var.g(value, mea0.a(mea0Var, a4h.f(arrayList), null, null, false, 62)));
            }
            return Unit.a;
        }
    }

    public static final class b implements lyh<Unit> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.android.social.presentation.search.SocialNetworkSearchViewModel$onFollowAccount$1$invokeSuspend$$inlined$map$1", f = "SocialNetworkSearchViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: oea0$b$b, reason: collision with other inner class name */
        public static final class C0940b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: oea0$b$b$a */
            @c0d(c = "com.sportybet.android.social.presentation.search.SocialNetworkSearchViewModel$onFollowAccount$1$invokeSuspend$$inlined$map$1$2", f = "SocialNetworkSearchViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C0940b.this.emit(null, this);
                }
            }

            public C0940b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws SprThrowable {
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
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    n52.c((BaseResponse) obj);
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

        public b(lyh lyhVar) {
            this.a = lyhVar;
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
                C0940b c0940b = new C0940b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0940b, aVar) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oea0(rea0 rea0Var, String str, v1b<? super oea0> v1bVar) {
        super(2, v1bVar);
        this.b = rea0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new oea0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((oea0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            rea0 rea0Var = this.b;
            rea0Var.i.d(AnalyticsEvent.SOCIAL_FOLLOW_CLICKED);
            vga0 vga0Var = rea0Var.e;
            String str = this.c;
            yzh yzhVarA = bm50.a(new b(vga0Var.b(str)));
            a aVar = new a(rea0Var, str);
            this.a = 1;
            if (yzhVarA.collect(aVar, this) == y5bVar) {
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
