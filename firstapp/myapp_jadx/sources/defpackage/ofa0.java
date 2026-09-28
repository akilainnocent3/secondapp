package defpackage;

import android.util.Pair;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.suggested.SocialNetworkSuggestedViewModel$onFollowSuggestedAccount$1", f = "SocialNetworkSuggestedViewModel.kt", l = {66}, m = "invokeSuspend", v = 2)
public final class ofa0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kfa0 b;
    public final /* synthetic */ String c;

    public static final class a<T> implements myh {
        public final /* synthetic */ kfa0 a;
        public final /* synthetic */ String b;

        public a(kfa0 kfa0Var, String str) {
            this.a = kfa0Var;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            jfa0 jfa0Var;
            ArrayList arrayList;
            Object value2;
            jfa0 jfa0Var2;
            ArrayList arrayList2;
            lk50 lk50Var = (lk50) obj;
            wwd0 wwd0Var = this.a.a;
            boolean z = lk50Var instanceof lk50.c;
            String str = this.b;
            if (z) {
                do {
                    value2 = wwd0Var.getValue();
                    jfa0Var2 = (jfa0) value2;
                    List<d9a0> list = jfa0Var2.a;
                    arrayList2 = new ArrayList(l48.r(list, 10));
                    for (d9a0 d9a0VarA : list) {
                        if (Intrinsics.g(d9a0VarA.a, str)) {
                            d9a0VarA = d9a0.a(d9a0VarA, true, y7i.a.a, 2007);
                        }
                        arrayList2.add(d9a0VarA);
                    }
                } while (!wwd0Var.g(value2, jfa0.a(jfa0Var2, arrayList2, null, false, 0, 30)));
            } else if (lk50Var instanceof lk50.a) {
                w950.a("PersonalSocialViewModel", "SocialNetworkUseCase.followUserSocialPage", ((lk50.a) lk50Var).a, kotlin.collections.a.c(new Pair("username", str)));
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                do {
                    value = wwd0Var.getValue();
                    jfa0Var = (jfa0) value;
                    List<d9a0> list2 = jfa0Var.a;
                    arrayList = new ArrayList(l48.r(list2, 10));
                    for (d9a0 d9a0VarA2 : list2) {
                        if (Intrinsics.g(d9a0VarA2.a, str)) {
                            d9a0VarA2 = d9a0.a(d9a0VarA2, false, y7i.b.a, 2015);
                        }
                        arrayList.add(d9a0VarA2);
                    }
                } while (!wwd0Var.g(value, jfa0.a(jfa0Var, arrayList, null, false, 0, 30)));
            }
            return Unit.a;
        }
    }

    public static final class b implements lyh<Unit> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.android.social.presentation.suggested.SocialNetworkSuggestedViewModel$onFollowSuggestedAccount$1$invokeSuspend$$inlined$map$1", f = "SocialNetworkSuggestedViewModel.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: ofa0$b$b, reason: collision with other inner class name */
        public static final class C0941b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: ofa0$b$b$a */
            @c0d(c = "com.sportybet.android.social.presentation.suggested.SocialNetworkSuggestedViewModel$onFollowSuggestedAccount$1$invokeSuspend$$inlined$map$1$2", f = "SocialNetworkSuggestedViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return C0941b.this.emit(null, this);
                }
            }

            public C0941b(myh myhVar) {
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
                C0941b c0941b = new C0941b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c0941b, aVar) == y5bVar) {
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
    public ofa0(kfa0 kfa0Var, String str, v1b<? super ofa0> v1bVar) {
        super(2, v1bVar);
        this.b = kfa0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ofa0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ofa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            kfa0 kfa0Var = this.b;
            kfa0Var.i.d(AnalyticsEvent.SOCIAL_FOLLOW_CLICKED);
            vga0 vga0Var = kfa0Var.e;
            String str = this.c;
            yzh yzhVarA = bm50.a(new b(vga0Var.b(str)));
            a aVar = new a(kfa0Var, str);
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
