package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class u7e0 implements wg50<InputStream, Bitmap> {
    public final c7f a;
    public final px0 b;

    public static class a implements c7f.b {
        public final bl40 a;
        public final ptg b;

        public a(bl40 bl40Var, ptg ptgVar) {
            this.a = bl40Var;
            this.b = ptgVar;
        }

        @Override // c7f.b
        public final void a() {
            bl40 bl40Var = this.a;
            synchronized (bl40Var) {
                bl40Var.c = bl40Var.a.length;
            }
        }

        @Override // c7f.b
        public final void b(ue4 ue4Var, Bitmap bitmap) throws IOException {
            IOException iOException = this.b.b;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                ue4Var.d(bitmap);
                throw iOException;
            }
        }
    }

    public u7e0(c7f c7fVar, px0 px0Var) {
        this.a = c7fVar;
        this.b = px0Var;
    }

    @Override // defpackage.wg50
    public final boolean a(InputStream inputStream, s2z s2zVar) {
        return true;
    }

    @Override // defpackage.wg50
    public final qg50<Bitmap> b(InputStream inputStream, int i, int i2, s2z s2zVar) {
        boolean z;
        bl40 bl40Var;
        ptg ptgVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof bl40) {
            bl40Var = (bl40) inputStream2;
            z = false;
        } else {
            z = true;
            bl40Var = new bl40(inputStream2, this.b);
        }
        ArrayDeque arrayDeque = ptg.c;
        synchronized (arrayDeque) {
            ptgVar = (ptg) arrayDeque.poll();
        }
        if (ptgVar == null) {
            ptgVar = new ptg();
        }
        ptg ptgVar2 = ptgVar;
        ptgVar2.a = bl40Var;
        npu npuVar = new npu(ptgVar2);
        a aVar = new a(bl40Var, ptgVar2);
        try {
            c7f c7fVar = this.a;
            we4 we4VarA = c7fVar.a(new ian.b(npuVar, c7fVar.d, c7fVar.c), i, i2, s2zVar, aVar);
            ptgVar2.b = null;
            ptgVar2.a = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(ptgVar2);
            }
            return we4VarA;
        } finally {
            ptgVar2.b = null;
            ptgVar2.a = null;
            ArrayDeque arrayDeque2 = ptg.c;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(ptgVar2);
                if (z) {
                    bl40Var.f();
                }
            }
        }
    }
}
