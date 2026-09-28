package defpackage;

import com.sporty.android.book.data.entity.CreateNoteOnBetRequest;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class d0y {
    public final jkb0 a;

    public d0y(jkb0 jkb0Var) {
        this.a = jkb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, x1b x1bVar, String str, String str2) throws SprThrowable {
        a0y a0yVar;
        if (x1bVar instanceof a0y) {
            a0yVar = (a0y) x1bVar;
            int i2 = a0yVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0yVar.c = i2 - Integer.MIN_VALUE;
            } else {
                a0yVar = new a0y(this, x1bVar);
            }
        } else {
            a0yVar = new a0y(this, x1bVar);
        }
        Object objG = a0yVar.a;
        y5b y5bVar = y5b.a;
        int i3 = a0yVar.c;
        if (i3 == 0) {
            uj50.b(objG);
            CreateNoteOnBetRequest createNoteOnBetRequest = new CreateNoteOnBetRequest(str);
            a0yVar.c = 1;
            objG = this.a.g(createNoteOnBetRequest, i, str2, a0yVar);
            if (objG == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objG);
        }
        n52.c((BaseResponse) objG);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i, x1b x1bVar, String str) throws SprThrowable {
        b0y b0yVar;
        if (x1bVar instanceof b0y) {
            b0yVar = (b0y) x1bVar;
            int i2 = b0yVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0yVar.c = i2 - Integer.MIN_VALUE;
            } else {
                b0yVar = new b0y(this, x1bVar);
            }
        } else {
            b0yVar = new b0y(this, x1bVar);
        }
        Object objM = b0yVar.a;
        y5b y5bVar = y5b.a;
        int i3 = b0yVar.c;
        if (i3 == 0) {
            uj50.b(objM);
            b0yVar.c = 1;
            objM = this.a.m(i, str, b0yVar);
            if (objM == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objM);
        }
        n52.c((BaseResponse) objM);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, x1b x1bVar, String str, String str2) throws SprThrowable {
        c0y c0yVar;
        if (x1bVar instanceof c0y) {
            c0yVar = (c0y) x1bVar;
            int i2 = c0yVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0yVar.c = i2 - Integer.MIN_VALUE;
            } else {
                c0yVar = new c0y(this, x1bVar);
            }
        } else {
            c0yVar = new c0y(this, x1bVar);
        }
        Object objC = c0yVar.a;
        y5b y5bVar = y5b.a;
        int i3 = c0yVar.c;
        if (i3 == 0) {
            uj50.b(objC);
            CreateNoteOnBetRequest createNoteOnBetRequest = new CreateNoteOnBetRequest(str);
            c0yVar.c = 1;
            objC = this.a.c(createNoteOnBetRequest, i, str2, c0yVar);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
        }
        n52.c((BaseResponse) objC);
        return Unit.a;
    }
}
