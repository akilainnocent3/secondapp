package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cl5 implements wg50<ByteBuffer, thk> {
    public static final a f = new a();
    public static final b g = new b();
    public final Context a;
    public final ArrayList b;
    public final phk e;
    public final a d = f;
    public final b c = g;

    public static class a {
    }

    public static class b {
        public final ArrayDeque a = new ArrayDeque(0);

        public final synchronized void a(aik aikVar) {
            aikVar.b = null;
            aikVar.c = null;
            this.a.offer(aikVar);
        }
    }

    public cl5(Context context, ArrayList arrayList, ue4 ue4Var, px0 px0Var) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.e = new phk(ue4Var, px0Var);
    }

    public static int d(zhk zhkVar, int i, int i2) {
        int iMin = Math.min(zhkVar.g / i2, zhkVar.f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbA = dy5.a("Downsampling GIF, sampleSize: ", iMax, i, ", target dimens: [", "x");
            sbA.append(i2);
            sbA.append("], actual dimens: [");
            sbA.append(zhkVar.f);
            sbA.append("x");
            sbA.append(zhkVar.g);
            sbA.append("]");
            Log.v("BufferGifDecoder", sbA.toString());
        }
        return iMax;
    }

    @Override // defpackage.wg50
    public final boolean a(ByteBuffer byteBuffer, s2z s2zVar) {
        return !((Boolean) s2zVar.c(cik.b)).booleanValue() && com.bumptech.glide.load.a.c(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // defpackage.wg50
    public final qg50<thk> b(ByteBuffer byteBuffer, int i, int i2, s2z s2zVar) {
        aik aikVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.c;
        synchronized (bVar) {
            try {
                aik aikVar2 = (aik) bVar.a.poll();
                if (aikVar2 == null) {
                    aikVar2 = new aik();
                }
                aikVar = aikVar2;
                aikVar.b = null;
                Arrays.fill(aikVar.a, (byte) 0);
                aikVar.c = new zhk();
                aikVar.d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                aikVar.b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                aikVar.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer2, i, i2, aikVar, s2zVar);
        } finally {
            this.c.a(aikVar);
        }
    }

    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:577)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:603)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    public final uhk c(ByteBuffer byteBuffer, int i, int i2, aik aikVar, s2z s2zVar) {
        StringBuilder sb;
        nvd0 nvd0Var;
        Bitmap.Config config;
        int i3 = agt.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            zhk zhkVarB = aikVar.b();
            if (zhkVarB.c > 0 && zhkVarB.b == 0) {
                Bitmap.Config config2 = s2zVar.c(cik.a) == r4d.b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(zhkVarB, i, i2);
                a aVar = this.d;
                phk phkVar = this.e;
                aVar.getClass();
                nvd0 nvd0Var2 = new nvd0(phkVar, zhkVarB, byteBuffer, iD);
                Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
                if (config2 == config3 || config2 == (config = Bitmap.Config.RGB_565)) {
                    nvd0Var = nvd0Var2;
                    nvd0Var.t = config2;
                } else {
                    nvd0Var = nvd0Var2;
                    e9h0.a(config2, "Unsupported format: ", ", must be one of ", config3, " or ", config);
                }
                nvd0Var.b();
                Bitmap bitmapA = nvd0Var.a();
                if (bitmapA == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(agt.a(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                uhk uhkVar = new uhk(new thk(new thk.a(new xhk(com.bumptech.glide.a.a(this.a), nvd0Var, i, i2, ffh0.b, bitmapA))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + agt.a(jElapsedRealtimeNanos));
                }
                return uhkVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(agt.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + agt.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
