package defpackage;

import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sporty.android.platform.features.newotp.util.OtpViewModelClasses;
import com.sportybet.feature.facialrecognition.model.FacialRecognitionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.validation.presentation.RegistrationValidationScreenKt$RegistrationValidationScreen$6$1", f = "RegistrationValidationScreen.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend", v = 2)
public final class i050 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ s050 b;
    public final /* synthetic */ tnu<OtpModule<OtpData.RegisterBrazil>, OtpData.RegisterBrazil> c;
    public final /* synthetic */ tnu<u6h, FacialRecognitionResult> d;

    public static final class a<T> implements myh {
        public final /* synthetic */ tnu<OtpModule<OtpData.RegisterBrazil>, OtpData.RegisterBrazil> a;
        public final /* synthetic */ s050 b;
        public final /* synthetic */ tnu<u6h, FacialRecognitionResult> c;

        public a(tnu<OtpModule<OtpData.RegisterBrazil>, OtpData.RegisterBrazil> tnuVar, s050 s050Var, tnu<u6h, FacialRecognitionResult> tnuVar2) {
            this.a = tnuVar;
            this.b = s050Var;
            this.c = tnuVar2;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            id90 id90Var = (id90) obj;
            if (id90Var instanceof k050.c) {
                s050 s050Var = this.b;
                com.sporty.android.platform.features.newotp.util.a aVar = s050Var.f;
                v340 v340Var = s050Var.b;
                String str = ((l050) v340Var.a.getValue()).b.a.b;
                String str2 = ((l050) v340Var.a.getValue()).c;
                String str3 = s050Var.z1().a;
                aVar.getClass();
                str.getClass();
                str2.getClass();
                this.a.b(new OtpModule(new OtpData.RegisterBrazil(str, str2, str3, 20), new OtpViewModelClasses(ft40.class, lt40.class, pt40.class, jt40.class, nt40.class, dt40.class)));
            } else if (id90Var instanceof k050.b) {
                this.c.b(((k050.b) id90Var).a);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i050(s050 s050Var, tnu<OtpModule<OtpData.RegisterBrazil>, OtpData.RegisterBrazil> tnuVar, tnu<u6h, FacialRecognitionResult> tnuVar2, v1b<? super i050> v1bVar) {
        super(2, v1bVar);
        this.b = s050Var;
        this.c = tnuVar;
        this.d = tnuVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i050(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((i050) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to i050 for r7v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L10:
            defpackage.uj50.b(r8)
            goto L2f
        L14:
            defpackage.uj50.b(r8)
            s050 r8 = r7.b
            t340 r1 = r8.d
            i050$a r4 = new i050$a
            tnu<com.sporty.android.platform.features.newotp.util.OtpModule<com.sporty.android.platform.features.newotp.util.OtpData$RegisterBrazil>, com.sporty.android.platform.features.newotp.util.OtpData$RegisterBrazil> r5 = r7.c
            tnu<u6h, com.sportybet.feature.facialrecognition.model.FacialRecognitionResult> r6 = r7.d
            r4.<init>(r5, r8, r6)
            r7.a = r3
            a390<T> r8 = r1.a
            java.lang.Object r7 = r8.collect(r4, r7)
            if (r7 != r0) goto L2f
            return r0
        L2f:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i050.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
