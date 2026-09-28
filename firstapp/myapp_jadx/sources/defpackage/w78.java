package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class w78 extends g2 {
    public final vsw<c9p> Z;
    public final vsw<a> a0;

    public static final class a {
    }

    public static final class b implements PointerInputEventHandler {

        @c0d(c = "androidx.compose.foundation.CombinedClickableNode$createPointerInputNodeIfNeeded$1$3", f = "Clickable.kt", l = {1121}, m = "invokeSuspend")
        public static final class a extends tje0 implements gaj<ip20, gly, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ ip20 b;
            public /* synthetic */ long c;
            public final /* synthetic */ w78 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w78 w78Var, v1b<? super a> v1bVar) {
                super(3, v1bVar);
                this.d = w78Var;
            }

            @Override // defpackage.gaj
            public final Object invoke(ip20 ip20Var, gly glyVar, v1b<? super Unit> v1bVar) {
                long j = glyVar.a;
                a aVar = new a(this.d, v1bVar);
                aVar.b = ip20Var;
                aVar.c = j;
                return aVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object objD;
                Object obj2 = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    ip20 ip20Var = this.b;
                    long j = this.c;
                    w78 w78Var = this.d;
                    if (w78Var.K) {
                        this.a = 1;
                        psw pswVar = w78Var.F;
                        if (pswVar == null || (objD = w5b.d(new j2(ip20Var, j, pswVar, w78Var, null), this)) != obj2) {
                            objD = Unit.a;
                        }
                        if (objD == obj2) {
                            return obj2;
                        }
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

        public b() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
            w78 w78Var = w78.this;
            a aVar = new a(w78Var, null);
            z23 z23Var = new z23(w78Var, 1);
            u4f0.a aVar2 = u4f0.a;
            Object objD = w5b.d(new y4f0(u020Var, aVar, null, null, z23Var, null), v1bVar);
            y5b y5bVar = y5b.a;
            if (objD != y5bVar) {
                objD = Unit.a;
            }
            return objD == y5bVar ? objD : Unit.a;
        }
    }

    public w78(Function0 function0, boolean z, psw pswVar, boolean z2) {
        super(pswVar, null, false, z2, null, null, function0);
        int i = fkt.a;
        this.Z = new vsw<>(6);
        this.a0 = new vsw<>(6);
    }

    @Override // defpackage.g2
    public final void A2(KeyEvent keyEvent) {
        long jA = emp.a(keyEvent);
        vsw<c9p> vswVar = this.Z;
        boolean z = false;
        if (vswVar.d(jA) != null) {
            c9p c9pVar = (c9p) vswVar.d(jA);
            if (c9pVar != null) {
                if (c9pVar.isActive()) {
                    c9pVar.cancel((CancellationException) null);
                } else {
                    z = true;
                }
            }
            vswVar.f(jA);
        }
        if (z) {
            return;
        }
        this.L.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[LOOP:2: B:24:0x0071->B:35:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:36:0x00a2 BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009f], SYNTHETIC] */
    public final void C2() {
        char c;
        long j;
        long j2;
        vsw<c9p> vswVar = this.Z;
        Object[] objArr = vswVar.c;
        long[] jArr = vswVar.a;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((c9p) objArr[(i << 3) + i3]).cancel((CancellationException) null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        vswVar.a();
        vsw<a> vswVar2 = this.a0;
        Object[] objArr2 = vswVar2.c;
        long[] jArr2 = vswVar2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((a) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        vswVar2.a();
    }

    @Override // androidx.compose.ui.d.c
    public final void j2() {
        C2();
    }

    @Override // defpackage.g2
    public final yje0 t2() {
        b bVar = new b();
        b020 b020Var = wje0.a;
        return new cke0(null, null, null, bVar);
    }

    @Override // defpackage.g2
    public final void y2() {
        C2();
    }

    @Override // defpackage.g2
    public final boolean z2(KeyEvent keyEvent) {
        if (((a) this.a0.d(emp.a(keyEvent))) == null) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.g2
    public final void s2(pb80 pb80Var) {
    }
}
