package defpackage;

import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sporty.android.common.network.util.MultipartBodyPartUtils$convertDataUriToMultipartBodyPart$2", f = "MultipartBodyPartUtils.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kmw extends tje0 implements Function2<v5b, v1b<? super MultipartBody.Part>, Object> {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmw(String str, v1b v1bVar) {
        super(2, v1bVar);
        this.a = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kmw(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super MultipartBody.Part> v1bVar) {
        return ((kmw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws IOException {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        byte[] bArrDecode = Base64.decode((String) StringsKt__StringsKt.split$default(this.a, new String[]{","}, false, 0, 6, null).get(1), 0);
        File fileCreateTempFile = File.createTempFile("upload", "share_loyalty_reward.jpeg");
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            fileOutputStream.write(bArrDecode);
            Unit unit = Unit.a;
            fileOutputStream.close();
            RequestBody.Companion companion = RequestBody.INSTANCE;
            fileCreateTempFile.getClass();
            return MultipartBody.Part.INSTANCE.createFormData("file", "share_loyalty_reward.jpeg", companion.create(fileCreateTempFile, MediaType.INSTANCE.parse("image/jpeg")));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ft7.a(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
