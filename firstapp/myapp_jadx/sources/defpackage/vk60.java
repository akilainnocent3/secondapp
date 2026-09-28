package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.SGSoundPool$getSoundFile$2", f = "SGSoundPool.kt", l = {}, m = "invokeSuspend", v = 1)
public final class vk60 extends tje0 implements Function2<v5b, v1b<? super File>, Object> {
    public final /* synthetic */ rk60.a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ rk60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk60(rk60.a aVar, String str, rk60 rk60Var, v1b<? super vk60> v1bVar) {
        super(2, v1bVar);
        this.a = aVar;
        this.b = str;
        this.c = rk60Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vk60(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super File> v1bVar) {
        return ((vk60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        rk60.a aVar = this.a;
        String str = aVar.d == rk60.b.b ? "common" : this.b;
        Context context = this.c.a;
        if (context == null) {
            return null;
        }
        File file = new File(new File(context.getFilesDir(), "sounds"), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.exists()) {
            return new File(file.getAbsolutePath(), aVar.b);
        }
        return null;
    }
}
