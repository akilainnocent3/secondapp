package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class osf {
    public ijf0 a;
    public rvf b;

    public final ijf0 a(List<? extends mof> list) {
        final mof mofVar;
        Exception e;
        try {
            int size = list.size();
            int i = 0;
            mofVar = null;
            while (i < size) {
                try {
                    mof mofVar2 = list.get(i);
                    try {
                        mofVar2.a(this.b);
                        i++;
                        mofVar = mofVar2;
                    } catch (Exception e2) {
                        e = e2;
                        mofVar = mofVar2;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(this.b.a.a());
                        sb2.append(", composition=");
                        sb2.append(this.b.c());
                        sb2.append(", selection=");
                        rvf rvfVar = this.b;
                        sb2.append((Object) ulf0.h(vlf0.a(rvfVar.b, rvfVar.c)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        CollectionsKt.Z(list, sb, "\n", new Function1(this) { // from class: nsf
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                String strConcat;
                                StringBuilder sb3;
                                int i2;
                                mof mofVar3 = (mof) obj;
                                String str = this.a == mofVar3 ? " > " : "   ";
                                if (!(mofVar3 instanceof ba8)) {
                                    if (mofVar3 instanceof rh80) {
                                        sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
                                        rh80 rh80Var = (rh80) mofVar3;
                                        sb3.append(rh80Var.a.b.length());
                                        sb3.append(", newCursorPosition=");
                                        i2 = rh80Var.b;
                                    } else if (mofVar3 instanceof qh80) {
                                        strConcat = ((qh80) mofVar3).toString();
                                    } else if (mofVar3 instanceof dmd) {
                                        strConcat = ((dmd) mofVar3).toString();
                                    } else if (mofVar3 instanceof emd) {
                                        strConcat = ((emd) mofVar3).toString();
                                    } else if (mofVar3 instanceof mi80) {
                                        strConcat = ((mi80) mofVar3).toString();
                                    } else if (mofVar3 instanceof eoh) {
                                        strConcat = "FinishComposingTextCommand()";
                                    } else if (mofVar3 instanceof rt1) {
                                        strConcat = "BackspaceCommand()";
                                    } else if (mofVar3 instanceof a7w) {
                                        strConcat = "MoveCursorCommand(amount=0)";
                                    } else if (mofVar3 instanceof pld) {
                                        strConcat = "DeleteAllCommand()";
                                    } else {
                                        String strK = jq40.a(mofVar3.getClass()).k();
                                        if (strK == null) {
                                            strK = "{anonymous EditCommand}";
                                        }
                                        strConcat = "Unknown EditCommand: ".concat(strK);
                                    }
                                    return str.concat(strConcat);
                                }
                                sb3 = new StringBuilder("CommitTextCommand(text.length=");
                                ba8 ba8Var = (ba8) mofVar3;
                                sb3.append(ba8Var.a.b.length());
                                sb3.append(", newCursorPosition=");
                                i2 = ba8Var.b;
                                strConcat = rr1.b(sb3, i2, ')');
                                return str.concat(strConcat);
                            }
                        }, 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            rvf rvfVar2 = this.b;
            rvfVar2.getClass();
            nk0 nk0Var = new nk0(rvfVar2.a.toString());
            rvf rvfVar3 = this.b;
            long jA = vlf0.a(rvfVar3.b, rvfVar3.c);
            ulf0 ulf0Var = ulf0.g(this.a.b) ? null : new ulf0(jA);
            ijf0 ijf0Var = new ijf0(nk0Var, ulf0Var != null ? ulf0Var.a : vlf0.a(ulf0.e(jA), ulf0.f(jA)), this.b.c());
            this.a = ijf0Var;
            return ijf0Var;
        } catch (Exception e4) {
            mofVar = null;
            e = e4;
        }
    }
}
