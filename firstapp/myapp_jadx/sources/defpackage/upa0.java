package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.loader.sound.SoundResourceBuilder$tryLoadSound$2", f = "SoundResourceBuilder.kt", l = {56}, m = "invokeSuspend", v = 1)
public final class upa0 extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public dq40 a;
    public int b;
    public final /* synthetic */ vpa0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upa0(vpa0 vpa0Var, String str, String str2, v1b<? super upa0> v1bVar) {
        super(2, v1bVar);
        this.c = vpa0Var;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new upa0(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((upa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Integer, java.lang.Number] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        dq40 dq40Var;
        vpa0 vpa0Var = this.c;
        LinkedHashMap linkedHashMap = vpa0Var.c;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            dq40 dq40VarA = j6w.a(obj);
            this.a = dq40VarA;
            this.b = 1;
            bc6 bc6Var = new bc6(1, yzo.b(this));
            bc6Var.q();
            ?? num = new Integer(vpa0Var.d.load(this.d, 1));
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(Boolean.FALSE);
            } else {
                linkedHashMap.put(new Integer(iIntValue), bc6Var);
            }
            dq40VarA.a = num;
            Object objO = bc6Var.o();
            if (objO == y5bVar) {
                return y5bVar;
            }
            dq40Var = dq40VarA;
            obj = objO;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40Var = this.a;
            uj50.b(obj);
        }
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        Integer num2 = (Integer) dq40Var.a;
        if (num2 != null) {
            linkedHashMap.remove(new Integer(num2.intValue()));
            Integer num3 = zBooleanValue ? new Integer(num2.intValue()) : null;
            if (num3 != null) {
                vpa0Var.b.put(this.e, new Integer(num3.intValue()));
            }
        }
        return bool;
    }
}
