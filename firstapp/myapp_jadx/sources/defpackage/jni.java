package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$state$1", f = "FootballViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jni extends tje0 implements jaj<smi, dbi, Boolean, py90, v1b<? super wmi>, Object> {
    public /* synthetic */ smi a;
    public /* synthetic */ dbi b;
    public /* synthetic */ boolean c;
    public /* synthetic */ py90 d;
    public final /* synthetic */ dni e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jni(v1b v1bVar, dni dniVar) {
        super(5, v1bVar);
        this.e = dniVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        smi smiVar = this.a;
        dbi dbiVar = this.b;
        boolean z2 = this.c;
        py90 py90Var = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (z2) {
            z = false;
        } else {
            dni dniVar = this.e;
            if (dniVar.G.getValue() == py90.c || dniVar.B.d) {
                z = false;
            } else {
                z = true;
            }
        }
        return new wmi(z, py90Var, dbiVar, smiVar);
    }

    @Override // defpackage.jaj
    public final Object l(smi smiVar, dbi dbiVar, Boolean bool, py90 py90Var, v1b<? super wmi> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        jni jniVar = new jni(v1bVar, this.e);
        jniVar.a = smiVar;
        jniVar.b = dbiVar;
        jniVar.c = zBooleanValue;
        jniVar.d = py90Var;
        return jniVar.invokeSuspend(Unit.a);
    }
}
