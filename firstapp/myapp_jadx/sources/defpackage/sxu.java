package defpackage;

import com.chad.library.adapter.base.entity.node.BaseNode;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.activity.MatchEventActivity$setupViewModel$$inlined$collectWithLifecycle$1", f = "MatchEventActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class sxu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ MatchEventActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ MatchEventActivity d;

    @c0d(c = "com.sportybet.android.virtual.presentation.activity.MatchEventActivity$setupViewModel$$inlined$collectWithLifecycle$1$1", f = "MatchEventActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ MatchEventActivity d;

        /* JADX INFO: renamed from: sxu$a$a, reason: collision with other inner class name */
        public static final class C1107a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ MatchEventActivity b;

            public C1107a(v5b v5bVar, MatchEventActivity matchEventActivity) {
                this.b = matchEventActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                final i5v i5vVar = (i5v) t;
                int i = MatchEventActivity.a0;
                if (!(i5vVar instanceof i5v.a)) {
                    uhc.a();
                    return null;
                }
                final MatchEventActivity matchEventActivity = this.b;
                bd bdVar = matchEventActivity.B;
                if (bdVar != null) {
                    bdVar.G.post(new Runnable() { // from class: owu
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object obj;
                            MatchEventActivity matchEventActivity2 = matchEventActivity;
                            if (matchEventActivity2.B == null) {
                                return;
                            }
                            String str = ((i5v.a) i5vVar).a;
                            int itemCount = matchEventActivity2.G1().getItemCount();
                            int iF1 = matchEventActivity2.H1().f1();
                            if (iF1 == -1 || iF1 >= itemCount) {
                                return;
                            }
                            Iterator<Integer> it = f.n(0, itemCount).iterator();
                            while (true) {
                                obj = null;
                                if (!((mwo) it).c) {
                                    break;
                                }
                                Object next = ((zvo) it).next();
                                BaseNode item = matchEventActivity2.G1().getItem(((Number) next).intValue());
                                if (item instanceof p2s) {
                                    obj = ((p2s) item).d;
                                } else if (item instanceof mpg) {
                                    obj = ((mpg) item).b;
                                }
                                if (Intrinsics.g(obj, str)) {
                                    obj = next;
                                    break;
                                }
                            }
                            Integer num = (Integer) obj;
                            if (num != null) {
                                int iIntValue = num.intValue();
                                byu byuVar = new byu(matchEventActivity2, f.d(Math.abs(iIntValue - iF1) / itemCount, 0.0f, 1.0f));
                                byuVar.a = iIntValue;
                                matchEventActivity2.H1().S0(byuVar);
                            }
                        }
                    });
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, MatchEventActivity matchEventActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = matchEventActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C1107a c1107a = new C1107a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1107a, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxu(MatchEventActivity matchEventActivity, lyh lyhVar, v1b v1bVar, MatchEventActivity matchEventActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = matchEventActivity;
        this.c = lyhVar;
        this.d = matchEventActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new sxu(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sxu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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
