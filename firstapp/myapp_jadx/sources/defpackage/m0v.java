package defpackage;

import android.content.DialogInterface;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity$uiEventFlowObserve$$inlined$collectWithLifecycle$1", f = "MatchEventDetailActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class m0v extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ MatchEventDetailActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ MatchEventDetailActivity d;

    @c0d(c = "com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity$uiEventFlowObserve$$inlined$collectWithLifecycle$1$1", f = "MatchEventDetailActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ MatchEventDetailActivity d;

        /* JADX INFO: renamed from: m0v$a$a, reason: collision with other inner class name */
        public static final class C0851a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ MatchEventDetailActivity b;

            public C0851a(v5b v5bVar, MatchEventDetailActivity matchEventDetailActivity) {
                this.b = matchEventDetailActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                final y2v y2vVar = (y2v) t;
                int i = MatchEventDetailActivity.U;
                if (!(y2vVar instanceof y2v.a)) {
                    uhc.a();
                    return null;
                }
                final MatchEventDetailActivity matchEventDetailActivity = this.b;
                if (matchEventDetailActivity.L1()) {
                    matchEventDetailActivity.Z1(new DialogInterface.OnClickListener() { // from class: pzu
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            int i3 = MatchEventDetailActivity.U;
                            dialogInterface.getClass();
                            dialogInterface.dismiss();
                            MatchEventDetailActivity matchEventDetailActivity2 = matchEventDetailActivity;
                            matchEventDetailActivity2.I1().A1();
                            matchEventDetailActivity2.I1().y1(new x2v.a(((y2v.a) y2vVar).a));
                        }
                    });
                } else {
                    matchEventDetailActivity.I1().y1(new x2v.a(((y2v.a) y2vVar).a));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, MatchEventDetailActivity matchEventDetailActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = matchEventDetailActivity;
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
                C0851a c0851a = new C0851a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0851a, this) == y5bVar) {
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
    public m0v(MatchEventDetailActivity matchEventDetailActivity, lyh lyhVar, v1b v1bVar, MatchEventDetailActivity matchEventDetailActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = matchEventDetailActivity;
        this.c = lyhVar;
        this.d = matchEventDetailActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new m0v(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((m0v) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
