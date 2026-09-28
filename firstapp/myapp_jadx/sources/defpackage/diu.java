package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class diu {
    public final nej a;
    public final kby b;
    public final u890 c;
    public final v5b d;
    public volatile String e;

    @c0d(c = "com.sportybet.android.network.metadata.MaidMetadataProvider$1", f = "MaidMetadataProvider.kt", l = {22, DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public diu a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return diu.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            diu diuVar;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                u890 u890Var = diu.this.c;
                this.b = 1;
                obj = u890Var.a(this);
                if (obj != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                diuVar = this.a;
                uj50.b(obj);
            }
            diuVar.e = (String) obj;
            return Unit.a;
            if (((Boolean) obj).booleanValue()) {
                diu diuVar2 = diu.this;
                this.a = diuVar2;
                this.b = 2;
                Object objA = diuVar2.a(this);
                if (objA != y5bVar) {
                    obj = objA;
                    diuVar = diuVar2;
                    diuVar.e = (String) obj;
                }
                return y5bVar;
            }
            return Unit.a;
        }
    }

    public diu(nej nejVar, kby kbyVar, u890 u890Var, @ApplicationScope v5b v5bVar) {
        v5bVar.getClass();
        this.a = nejVar;
        this.b = kbyVar;
        this.c = u890Var;
        this.d = v5bVar;
        ej5.c(v5bVar, null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        eiu eiuVar;
        String str;
        String str2;
        StringBuilder sb;
        String string;
        if (x1bVar instanceof eiu) {
            eiuVar = (eiu) x1bVar;
            int i = eiuVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eiuVar.d = i - Integer.MIN_VALUE;
            } else {
                eiuVar = new eiu(this, x1bVar);
            }
        } else {
            eiuVar = new eiu(this, x1bVar);
        }
        Object objD = eiuVar.b;
        y5b y5bVar = y5b.a;
        int i2 = eiuVar.d;
        if (i2 == 0) {
            uj50.b(objD);
            eiuVar.d = 1;
            nej nejVar = this.a;
            objD = ej5.d(nejVar.b, new mej(nejVar, null), eiuVar);
            if (objD != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(objD);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = eiuVar.a;
            uj50.b(objD);
        }
        str2 = (String) objD;
        if (str2 != null || StringsKt.U(str2) || str2.equals("00000000-0000-0000-0000-000000000000")) {
            str2 = null;
        }
        sb = new StringBuilder();
        if (str != null) {
            sb.append("gaid=".concat(str));
        }
        if (str2 != null) {
            if (str != null) {
                sb.append("&");
            }
            sb.append("oaid=".concat(str2));
        }
        string = sb.toString();
        if (string.length() > 0) {
            return string;
        }
        return null;
        String str3 = (String) objD;
        if (str3 == null || StringsKt.U(str3) || str3.equals("00000000-0000-0000-0000-000000000000")) {
            str3 = null;
        }
        eiuVar.a = str3;
        eiuVar.d = 2;
        kby kbyVar = this.b;
        Object objD2 = ej5.d(kbyVar.b, new jby(kbyVar, null), eiuVar);
        if (objD2 != y5bVar) {
            String str4 = str3;
            objD = objD2;
            str = str4;
            str2 = (String) objD;
            if (str2 != null) {
                str2 = null;
            } else {
                str2 = null;
            }
            sb = new StringBuilder();
            if (str != null) {
                sb.append("gaid=".concat(str));
            }
            if (str2 != null) {
                if (str != null) {
                    sb.append("&");
                }
                sb.append("oaid=".concat(str2));
            }
            string = sb.toString();
            if (string.length() > 0) {
                return string;
            }
            return null;
        }
        return y5bVar;
    }
}
