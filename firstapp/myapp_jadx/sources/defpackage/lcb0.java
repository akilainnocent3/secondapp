package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.cms.repositories.SpineRepository$downloadSpine$2", f = "SpineRepository.kt", l = {285}, m = "invokeSuspend", v = 1)
public final class lcb0 extends tje0 implements Function2<v5b, v1b<? super jcb0>, Object> {
    public String a;
    public quw b;
    public Context c;
    public mcb0 d;
    public String e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;
    public final /* synthetic */ mcb0 y;
    public final /* synthetic */ Context z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcb0(String str, String str2, mcb0 mcb0Var, Context context, v1b<? super lcb0> v1bVar) {
        super(2, v1bVar);
        this.v = str;
        this.w = str2;
        this.y = mcb0Var;
        this.z = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lcb0 lcb0Var = new lcb0(this.v, this.w, this.y, this.z, v1bVar);
        lcb0Var.i = obj;
        return lcb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super jcb0> v1bVar) {
        return ((lcb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0131 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #1 {all -> 0x00c4, blocks: (B:23:0x0079, B:26:0x008d, B:28:0x00be, B:32:0x00c7, B:34:0x00cd, B:35:0x00d4, B:37:0x00e0, B:39:0x00e3, B:40:0x00ec, B:42:0x00f2, B:43:0x00fb, B:49:0x0118, B:51:0x011c, B:52:0x0128, B:53:0x012b, B:55:0x0131, B:48:0x0110, B:45:0x0104), top: B:63:0x0079, outer: #0, inners: #2 }] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        mcb0 mcb0Var;
        quw quwVar;
        Context context;
        quw quwVarPutIfAbsent;
        Object bVar;
        v5b v5bVar = (v5b) this.i;
        y5b y5bVar = y5b.a;
        int i = this.f;
        mcb0 mcb0Var2 = this.y;
        try {
            if (i == 0) {
                uj50.b(obj);
                String str3 = this.w;
                String str4 = this.v + "_" + str3.hashCode();
                ConcurrentHashMap<String, quw> concurrentHashMap = mcb0Var2.d;
                quw quwVarA = concurrentHashMap.get(str4);
                if (quwVarA == null && (quwVarPutIfAbsent = concurrentHashMap.putIfAbsent(str4, (quwVarA = uuw.a()))) != null) {
                    quwVarA = quwVarPutIfAbsent;
                }
                quw quwVar2 = quwVarA;
                Context context2 = this.z;
                this.i = v5bVar;
                this.a = str4;
                this.b = quwVar2;
                this.c = context2;
                this.d = mcb0Var2;
                this.e = str3;
                this.f = 1;
                if (quwVar2.d(this) == y5bVar) {
                    return y5bVar;
                }
                str = str3;
                str2 = str4;
                mcb0Var = mcb0Var2;
                quwVar = quwVar2;
                context = context2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = this.e;
                mcb0Var = this.d;
                context = this.c;
                quwVar = this.b;
                str2 = this.a;
                uj50.b(obj);
            }
            try {
                File file = new File(context.getDir("spine_assets", 0), str2);
                jcb0 jcb0VarD = mcb0Var.d(file);
                if (jcb0VarD == null) {
                    File file2 = new File(file.getParentFile(), str2 + "_tmp");
                    qlh.j(file2);
                    file2.mkdirs();
                    File file3 = new File(file2, StringsKt.m0(str, "/", str));
                    if (!mcb0.a(file3, str)) {
                        qlh.j(file2);
                    } else if (mcb0.e(file3, file2)) {
                        file3.delete();
                        mcb0.b(file2);
                        File[] fileArrListFiles = file2.listFiles();
                        if (fileArrListFiles != null && fileArrListFiles.length == 0) {
                            mcb0.c("Folder empty after flattening");
                            qlh.j(file2);
                        } else if (mcb0Var.d(file2) == null) {
                            mcb0.c("Validation failed in temp folder");
                            qlh.j(file2);
                        } else {
                            qlh.j(file);
                            if (file2.renameTo(file)) {
                                jcb0VarD = mcb0Var.d(file);
                                if (jcb0VarD == null) {
                                    mcb0.c("Final validation failed");
                                    qlh.j(file);
                                }
                            } else {
                                try {
                                    zi50.a aVar = zi50.b;
                                    bVar = Boolean.valueOf(qlh.h(file2, file));
                                } catch (Throwable th) {
                                    zi50.a aVar2 = zi50.b;
                                    bVar = new zi50.b(th);
                                }
                                if (bVar instanceof zi50.b) {
                                    mcb0.c("Move failed");
                                    qlh.j(file2);
                                    qlh.j(file);
                                } else {
                                    qlh.j(file2);
                                    jcb0VarD = mcb0Var.d(file);
                                    if (jcb0VarD == null) {
                                        mcb0.c("Final validation failed");
                                        qlh.j(file);
                                    }
                                }
                            }
                        }
                    } else {
                        file3.delete();
                        qlh.j(file2);
                    }
                    jcb0VarD = null;
                }
                quwVar.f(null);
                return jcb0VarD;
            } catch (Throwable th2) {
                quwVar.f(null);
                throw th2;
            }
        } catch (Exception e) {
            String str5 = "Unexpected Exception: " + e.getLocalizedMessage();
            mcb0Var2.getClass();
            mcb0.c(str5);
            return null;
        }
    }
}
