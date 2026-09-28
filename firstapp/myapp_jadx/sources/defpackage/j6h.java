package defpackage;

import androidx.fragment.app.e;
import com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$collectCloudflareState$$inlined$launchAndRepeatWithLifecycle$default$1", f = "FacialRecognitionActivity.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class j6h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ FacialRecognitionActivity c;

    @c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity$collectCloudflareState$$inlined$launchAndRepeatWithLifecycle$default$1$1", f = "FacialRecognitionActivity.kt", l = {58}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ FacialRecognitionActivity c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, FacialRecognitionActivity facialRecognitionActivity) {
            super(2, v1bVar);
            this.c = facialRecognitionActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.c);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                int i2 = FacialRecognitionActivity.f;
                FacialRecognitionActivity facialRecognitionActivity = this.c;
                yt7 yt7Var = ((au7) facialRecognitionActivity.b.getValue()).d;
                k6h k6hVar = new k6h(facialRecognitionActivity);
                this.b = null;
                this.a = 1;
                if (yt7Var.collect(k6hVar, this) == y5bVar) {
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
    public j6h(e eVar, v1b v1bVar, FacialRecognitionActivity facialRecognitionActivity) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = eVar;
        this.c = facialRecognitionActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new j6h(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j6h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(null, this.c);
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
