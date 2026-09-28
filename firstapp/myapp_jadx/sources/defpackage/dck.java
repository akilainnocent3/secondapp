package defpackage;

import android.util.Pair;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.integrity.GetPlayIntegrityTokenUseCase$invoke$2", f = "GetPlayIntegrityTokenUseCase.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class dck extends tje0 implements Function2<ez20<? super bck.a>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bck c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dck(bck bckVar, String str, long j, v1b<? super dck> v1bVar) {
        super(2, v1bVar);
        this.c = bckVar;
        this.d = str;
        this.e = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dck dckVar = new dck(this.c, this.d, this.e, v1bVar);
        dckVar.b = obj;
        return dckVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super bck.a> ez20Var, v1b<? super Unit> v1bVar) {
        return ((dck) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final bck bckVar = this.c;
            bckVar.a.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(this.d).setCloudProjectNumber(this.e).build()).addOnCompleteListener(new OnCompleteListener(bckVar) { // from class: cck
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    rde rdeVar;
                    boolean zIsSuccessful = task.isSuccessful();
                    ez20 ez20Var2 = this.a;
                    if (zIsSuccessful) {
                        String str = ((IntegrityTokenResponse) task.getResult()).token();
                        str.getClass();
                        ez20Var2.c(new bck.a.c(str));
                        return;
                    }
                    if (task.isCanceled()) {
                        ez20Var2.c(bck.a.C0118a.a);
                        return;
                    }
                    Exception exception = task.getException();
                    IntegrityServiceException integrityServiceException = exception instanceof IntegrityServiceException ? (IntegrityServiceException) exception : null;
                    Integer numValueOf = integrityServiceException != null ? Integer.valueOf(integrityServiceException.getErrorCode()) : null;
                    w950.a("GetPlayIntegrityTokenUseCase", "logPlayIntegrityError", new Exception("Play Integrity API error"), a.c(new Pair("errorCode", String.valueOf(numValueOf))));
                    w950.a.c().b();
                    if ((numValueOf != null && numValueOf.intValue() == -3) || ((numValueOf != null && numValueOf.intValue() == -8) || (numValueOf != null && numValueOf.intValue() == -9))) {
                        rdeVar = rde.i;
                    } else if ((numValueOf != null && numValueOf.intValue() == -7) || ((numValueOf != null && numValueOf.intValue() == -1) || ((numValueOf != null && numValueOf.intValue() == -2) || ((numValueOf != null && numValueOf.intValue() == -5) || (numValueOf != null && numValueOf.intValue() == -6))))) {
                        rdeVar = rde.c;
                    } else if ((numValueOf != null && numValueOf.intValue() == -4) || ((numValueOf != null && numValueOf.intValue() == -14) || (numValueOf != null && numValueOf.intValue() == -15))) {
                        rdeVar = rde.d;
                    } else {
                        rdeVar = ((numValueOf != null && numValueOf.intValue() == -16) || ((numValueOf == null || numValueOf.intValue() != -10) && ((numValueOf != null && numValueOf.intValue() == -11) || ((numValueOf == null || numValueOf.intValue() != -12) && ((numValueOf != null && numValueOf.intValue() == -13) || !((numValueOf != null && numValueOf.intValue() == -17) || numValueOf == null || numValueOf.intValue() == -100)))))) ? rde.e : rde.e;
                    }
                    ez20Var2.c(new bck.a.b(numValueOf, rdeVar));
                }
            });
            this.b = null;
            this.a = 1;
            if (az20.a(ez20Var, new zy20(), this) == y5bVar) {
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
