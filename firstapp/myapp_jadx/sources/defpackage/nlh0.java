package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.luckynumber.showoff.data.LNUploadImgDTO;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.showoff.domain.UploadLuckyNumberScreenshotUseCase$invoke$1", f = "UploadLuckyNumberScreenshotUseCase.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class nlh0 extends tje0 implements Function2<myh<? super BaseResponse<LNUploadImgDTO>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ olh0 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlh0(String str, olh0 olh0Var, String str2, String str3, v1b<? super nlh0> v1bVar) {
        super(2, v1bVar);
        this.c = str;
        this.d = olh0Var;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nlh0 nlh0Var = new nlh0(this.c, this.d, this.e, this.f, v1bVar);
        nlh0Var.b = obj;
        return nlh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<LNUploadImgDTO>> myhVar, v1b<? super Unit> v1bVar) {
        return ((nlh0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            String str = this.c;
            File file = new File(str);
            MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", file.getName(), RequestBody.INSTANCE.create(new File(str), MediaType.INSTANCE.parse("image/jpeg")));
            i6u i6uVar = this.d.a;
            i6uVar.getClass();
            String str2 = this.e;
            str2.getClass();
            partCreateFormData.getClass();
            or60 or60Var = new or60(new u6u(i6uVar, str2, partCreateFormData, this.f, null));
            this.b = null;
            this.a = 1;
            if (kzh.c(myhVar, or60Var, this) == y5bVar) {
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
