package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.patron.VerifiedInfoResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxxh0;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xxh0 extends j8i0 {
    public final eip a;
    public final mpe0 b;
    public jvd0 c;
    public final ssw<lk50<List<uxh0>>> d;
    public final ssw e;

    public static final class a implements lyh<lk50<? extends List<? extends uxh0>>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ xxh0 b;

        /* JADX INFO: renamed from: xxh0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.user.verifiedinfo.VerifiedInfoViewModel$getUserSubmissions$$inlined$map$1", f = "VerifiedInfoViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1314a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1314a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ xxh0 b;

            /* JADX INFO: renamed from: xxh0$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.user.verifiedinfo.VerifiedInfoViewModel$getUserSubmissions$$inlined$map$1$2", f = "VerifiedInfoViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1315a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1315a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, xxh0 xxh0Var) {
                this.a = myhVar;
                this.b = xxh0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1315a c1315a;
                if (v1bVar instanceof C1315a) {
                    c1315a = (C1315a) v1bVar;
                    int i = c1315a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1315a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1315a = new C1315a(v1bVar);
                    }
                } else {
                    c1315a = new C1315a(v1bVar);
                }
                Object obj2 = c1315a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1315a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    T t = ((BaseResponse) obj).data;
                    t.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (T t2 : (Iterable) t) {
                        if (((VerifiedInfoResponse) t2).isDisplay()) {
                            arrayList.add(t2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        VerifiedInfoResponse verifiedInfoResponse = (VerifiedInfoResponse) obj3;
                        boolean zIsDisplay = verifiedInfoResponse.isDisplay();
                        String requirementId = verifiedInfoResponse.getRequirementId();
                        String requirementName = verifiedInfoResponse.getRequirementName();
                        String lowerCase = requirementName.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        int identifier = ((Resources) this.b.b.getValue()).getIdentifier(kotlin.text.c.p(lowerCase, " ", "_", false), "string", null);
                        arrayList2.add(new uxh0(verifiedInfoResponse.getStatus(), identifier == 0 ? new StringUiText(requirementName) : new ResourceUiText(identifier), requirementId, verifiedInfoResponse.getRequirementValue(), zIsDisplay, verifiedInfoResponse.getStatus() == 30));
                    }
                    lk50.c cVar = new lk50.c(arrayList2);
                    c1315a.b = 1;
                    if (this.a.emit(cVar, c1315a) == y5bVar) {
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

        public a(lyh lyhVar, xxh0 xxh0Var) {
            this.a = lyhVar;
            this.b = xxh0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lk50<? extends List<? extends uxh0>>> myhVar, v1b v1bVar) {
            C1314a c1314a;
            if (v1bVar instanceof C1314a) {
                c1314a = (C1314a) v1bVar;
                int i = c1314a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1314a.b = i - Integer.MIN_VALUE;
                } else {
                    c1314a = new C1314a(v1bVar);
                }
            } else {
                c1314a = new C1314a(v1bVar);
            }
            Object obj = c1314a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1314a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c1314a.b = 1;
                if (this.a.collect(bVar, c1314a) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.user.verifiedinfo.VerifiedInfoViewModel$getUserSubmissions$2", f = "VerifiedInfoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super lk50<? extends List<? extends uxh0>>>, v1b<? super Unit>, Object> {
        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return xxh0.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super lk50<? extends List<? extends uxh0>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            xxh0.this.d.m(lk50.b.a);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.user.verifiedinfo.VerifiedInfoViewModel$getUserSubmissions$3", f = "VerifiedInfoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<lk50<? extends List<? extends uxh0>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = xxh0.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends List<? extends uxh0>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((c) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50<List<uxh0>> lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            xxh0.this.d.m(lk50Var);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.user.verifiedinfo.VerifiedInfoViewModel$getUserSubmissions$4", f = "VerifiedInfoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements gaj<myh<? super lk50<? extends List<? extends uxh0>>>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        public d(v1b<? super d> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends List<? extends uxh0>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            d dVar = xxh0.this.new d(v1bVar);
            dVar.a = th;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            xxh0.this.d.m(new lk50.a(th));
            return Unit.a;
        }
    }

    public xxh0(final Context context, eip eipVar) {
        eipVar.getClass();
        this.a = eipVar;
        this.b = hwr.b(new Function0() { // from class: wxh0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return context.getResources();
            }
        });
        ssw<lk50<List<uxh0>>> sswVar = new ssw<>();
        this.d = sswVar;
        this.e = sswVar;
    }

    public final void x1(String str) {
        jvd0 jvd0Var = this.c;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.c = kzh.d(new yzh(new g1i(new xzh(new a(this.a.a(str), this), new b(null)), new c(null)), new d(null)), o8i0.d(this));
    }
}
