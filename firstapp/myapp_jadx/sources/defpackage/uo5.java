package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.cms.repositories.CMSRepository$fileSave$2", f = "CMSRepository.kt", l = {}, m = "invokeSuspend", v = 1)
public final class uo5 extends tje0 implements Function2<v5b, v1b<? super File>, Object> {
    public final /* synthetic */ to5 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo5(to5 to5Var, String str, String str2, v1b<? super uo5> v1bVar) {
        super(2, v1bVar);
        this.a = to5Var;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uo5(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super File> v1bVar) {
        return ((uo5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        to5 to5Var = this.a;
        Context context = to5Var.a;
        if (context == null) {
            return new File("");
        }
        File fileB = to5.b(context);
        String str = this.b;
        boolean zEquals = str.equals("apiFailed");
        String str2 = this.c;
        if (zEquals) {
            return new File(fileB, oxc.a(str2, "_", to5Var.b));
        }
        File file = new File(fileB, oxc.a(str2, "_", to5Var.b));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        return file;
    }
}
