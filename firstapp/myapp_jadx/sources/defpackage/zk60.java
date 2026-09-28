package defpackage;

import java.io.File;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.SGSoundPool$playRushBgSound$soundJob$1", f = "SGSoundPool.kt", l = {232, 243}, m = "invokeSuspend", v = 1)
public final class zk60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public rk60 a;
    public rk60 b;
    public int c;
    public final /* synthetic */ rk60 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk60(rk60 rk60Var, String str, String str2, v1b<? super zk60> v1bVar) {
        super(2, v1bVar);
        this.d = rk60Var;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zk60(this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zk60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c2  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        rk60 rk60Var;
        rk60 rk60Var2;
        String path;
        rk60.a aVar;
        String str;
        rk60 rk60Var3;
        String str2;
        rk60 rk60Var4;
        String str3;
        String str4;
        String path2;
        rk60 rk60Var5 = this.d;
        String str5 = rk60Var5.b;
        HashMap<String, rk60.a> map = rk60Var5.c;
        y5b y5bVar = y5b.a;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                rk60Var = this.b;
                rk60Var2 = this.a;
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rk60Var5 = this.b;
                rk60Var3 = this.a;
                uj50.b(obj);
            }
            File file = (File) obj;
            path2 = file != null ? file.getPath() : null;
            rk60Var4 = rk60Var3;
            if (path2 == null) {
                str2 = "";
            } else {
                str2 = path2;
            }
            rk60Var5.k = str2;
            str4 = rk60Var4.k;
            if (!new File(str4 != null ? str4 : "").exists()) {
                return Unit.a;
            }
            return Unit.a;
        }
        uj50.b(obj);
        rk60.a aVar2 = map.get(this.e);
        if (aVar2 == null) {
            aVar = map.get(this.f);
            if (aVar != null) {
                str = rk60Var5.k;
                if (str != null || str.length() == 0) {
                    this.a = rk60Var5;
                    this.b = rk60Var5;
                    this.c = 2;
                    obj = rk60Var5.b(aVar, str5, this);
                    if (obj != y5bVar) {
                        rk60Var3 = rk60Var5;
                        File file2 = (File) obj;
                        if (file2 != null) {
                        }
                        rk60Var4 = rk60Var3;
                        if (path2 == null) {
                            str2 = "";
                        } else {
                            str2 = path2;
                        }
                    }
                } else {
                    str2 = rk60Var5.k;
                    rk60Var4 = rk60Var5;
                }
                rk60Var5.k = str2;
                str4 = rk60Var4.k;
                if (!new File(str4 != null ? str4 : "").exists()) {
                    return Unit.a;
                }
            }
            return Unit.a;
        }
        String str6 = rk60Var5.j;
        if (str6 != null && str6.length() != 0) {
            path = rk60Var5.j;
            rk60Var = rk60Var5;
            rk60Var2 = rk60Var;
            rk60Var.j = path;
            str3 = rk60Var2.j;
            if (str3 == null) {
                str3 = "";
            }
            if (!new File(str3).exists()) {
                return Unit.a;
            }
            aVar = map.get(this.f);
            if (aVar != null) {
                str = rk60Var5.k;
                if (str != null) {
                }
                this.a = rk60Var5;
                this.b = rk60Var5;
                this.c = 2;
                obj = rk60Var5.b(aVar, str5, this);
                if (obj != y5bVar) {
                    rk60Var3 = rk60Var5;
                    File file3 = (File) obj;
                    if (file3 != null) {
                    }
                    rk60Var4 = rk60Var3;
                    if (path2 == null) {
                        str2 = "";
                    } else {
                        str2 = path2;
                    }
                    rk60Var5.k = str2;
                    str4 = rk60Var4.k;
                    if (!new File(str4 != null ? str4 : "").exists()) {
                        return Unit.a;
                    }
                }
            }
            return Unit.a;
        }
        this.a = rk60Var5;
        this.b = rk60Var5;
        this.c = 1;
        obj = rk60Var5.b(aVar2, str5, this);
        if (obj != y5bVar) {
            rk60Var = rk60Var5;
            rk60Var2 = rk60Var;
        }
        return y5bVar;
        File file4 = (File) obj;
        path = file4 != null ? file4.getPath() : null;
        if (path == null) {
            path = "";
        }
        rk60Var.j = path;
        str3 = rk60Var2.j;
        if (str3 == null) {
            str3 = "";
        }
        if (!new File(str3).exists()) {
            return Unit.a;
        }
        aVar = map.get(this.f);
        if (aVar != null) {
            str = rk60Var5.k;
            if (str != null) {
            }
            this.a = rk60Var5;
            this.b = rk60Var5;
            this.c = 2;
            obj = rk60Var5.b(aVar, str5, this);
            if (obj != y5bVar) {
                rk60Var3 = rk60Var5;
                File file5 = (File) obj;
                if (file5 != null) {
                }
                rk60Var4 = rk60Var3;
                if (path2 == null) {
                    str2 = "";
                } else {
                    str2 = path2;
                }
                rk60Var5.k = str2;
                str4 = rk60Var4.k;
                if (!new File(str4 != null ? str4 : "").exists()) {
                    return Unit.a;
                }
            }
            return y5bVar;
        }
        return Unit.a;
    }
}
