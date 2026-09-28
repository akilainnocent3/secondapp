package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.opengl.GLUtils;
import com.sportybet.android.gp.tz.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes7.dex */
public final class hln {
    public final Bitmap[] a = new Bitmap[6];
    public int[] b = {R.drawable.flat_dice_1, R.drawable.flat_dice_1, R.drawable.flat_dice_1, R.drawable.flat_dice_1, R.drawable.flat_dice, R.drawable.sporty};
    public final int[] c = new int[6];
    public float d = 0.8f;
    public final float[] e = {1.0f, 0.9372549f, 0.76862746f, 0.0f, 1.0f, 0.9372549f, 0.76862746f, 0.0f, 0.98039216f, 0.78431374f, 0.24313726f, 0.3f, 0.98039216f, 0.78431374f, 0.24313726f, 0.3f};
    public FloatBuffer f;
    public FloatBuffer g;
    public GL10 h;
    public Bitmap i;

    public hln(Context context) {
        c(context);
    }

    public final void a(GL10 gl10, Context context, edg edgVar) {
        Bitmap bitmapCreateBitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        int i = 0;
        while (true) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            Matrix matrix = new Matrix();
            matrix.postRotate(180.0f);
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i2, options);
            if (bitmapDecodeResource == null) {
                bitmapCreateBitmap = null;
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, true);
                this.i = bitmapCreateBitmap;
            }
            Bitmap[] bitmapArr = this.a;
            bitmapArr[i] = bitmapCreateBitmap;
            if (bitmapCreateBitmap != null) {
                GLUtils.texImage2D(3553, 0, bitmapCreateBitmap, 0);
                bitmapArr[i].recycle();
            }
            Bitmap bitmap = this.i;
            if (bitmap != null) {
                bitmap.recycle();
            }
            i++;
        }
        gl10.glEnableClientState(32884);
        gl10.glEnableClientState(32888);
        gl10.glVertexPointer(3, 5126, 0, this.f);
        gl10.glTexCoordPointer(2, 5126, 0, this.g);
        gl10.glDisableClientState(32886);
        gl10.glEnable(3553);
        gl10.glDepthFunc(513);
        gl10.glPopMatrix();
        gl10.glPushMatrix();
        edg edgVar2 = edg.i;
        if (edgVar != edgVar2) {
            gl10.glRotatef(0.0f, 0.0f, 0.0f, 0.0f);
        }
        gl10.glTranslatef(0.0f, 0.0f, this.d);
        float[] fArr = this.e;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        gl10.glColorPointer(4, 5126, 0, floatBufferAsFloatBuffer);
        int[] iArr2 = this.c;
        gl10.glBindTexture(3553, iArr2[0]);
        gl10.glDrawArrays(5, 0, 0);
        gl10.glPopMatrix();
        gl10.glPushMatrix();
        gl10.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
        gl10.glTranslatef(0.0f, 0.0f, this.d);
        gl10.glBindTexture(3553, iArr2[1]);
        gl10.glDrawArrays(5, 4, 4);
        gl10.glPopMatrix();
        gl10.glPushMatrix();
        gl10.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        gl10.glTranslatef(0.0f, 0.0f, this.d);
        gl10.glBindTexture(3553, iArr2[2]);
        gl10.glDrawArrays(5, 8, 4);
        gl10.glPopMatrix();
        gl10.glPushMatrix();
        gl10.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
        gl10.glTranslatef(0.0f, 0.0f, this.d);
        gl10.glBindTexture(3553, iArr2[3]);
        gl10.glDrawArrays(5, 12, 4);
        gl10.glPopMatrix();
        gl10.glPushMatrix();
        gl10.glRotatef(270.0f, 1.0f, 0.0f, 0.0f);
        float f = this.d;
        if (edgVar == edgVar2) {
            gl10.glTranslatef(0.0f, 0.0f, f + 0.6f);
        } else {
            gl10.glTranslatef(0.0f, 0.0f, f);
        }
        gl10.glBindTexture(3553, iArr2[4]);
        gl10.glDrawArrays(5, 16, 4);
        gl10.glPopMatrix();
        gl10.glPushMatrix();
        gl10.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
        gl10.glTranslatef(0.0f, 0.0f, this.d);
        gl10.glBindTexture(3553, iArr2[5]);
        gl10.glDrawArrays(5, 20, 4);
        gl10.glPopMatrix();
        gl10.glDisableClientState(32884);
        gl10.glDisableClientState(32888);
    }

    public final void b(GL10 gl10) {
        Bitmap[] bitmapArr = this.a;
        int[] iArr = this.c;
        try {
            gl10.glGenTextures(6, iArr, 0);
            this.h = gl10;
            for (int i = 0; i < 6; i++) {
                this.h.glEnable(3042);
                this.h.glBlendFunc(770, 771);
                gl10.glBindTexture(3553, iArr[i]);
                gl10.glTexParameterf(3553, 10241, 9728.0f);
                gl10.glTexParameterf(3553, 10240, 9729.0f);
                Bitmap bitmap = bitmapArr[i];
                if (bitmap != null) {
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    bitmapArr[i].recycle();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void c(Context context) {
        float f;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(480);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.f = byteBufferAllocateDirect.asFloatBuffer();
        for (int i = 0; i < 6; i++) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getResources().openRawResource(this.b[i]));
            Bitmap[] bitmapArr = this.a;
            bitmapArr[i] = bitmapDecodeStream;
            int width = bitmapDecodeStream.getWidth();
            int height = bitmapArr[i].getHeight();
            float f2 = 1.5f;
            if (width > height) {
                f = (height * 1.5f) / width;
            } else {
                float f3 = (width * 1.5f) / height;
                f = 1.5f;
                f2 = f3;
            }
            float f4 = (-f2) / 1.3f;
            float f5 = -f4;
            float f6 = f / 1.3f;
            float f7 = -f6;
            this.f.put(new float[]{f4, f7, 0.0f, f5, f7, 0.0f, f4, f6, 0.0f, f5, f6, 0.0f});
        }
        this.f.position(0);
        float[] fArr = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(192);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.g = byteBufferAllocateDirect2.asFloatBuffer();
        int i2 = 0;
        while (true) {
            FloatBuffer floatBuffer = this.g;
            if (i2 >= 6) {
                floatBuffer.position(0);
                return;
            } else {
                floatBuffer.put(fArr);
                i2++;
            }
        }
    }

    public final void d(Context context, int[] iArr) {
        GL10 gl10;
        int[] iArr2;
        int i = 0;
        while (true) {
            int length = iArr.length;
            gl10 = this.h;
            iArr2 = this.c;
            if (i >= length) {
                break;
            }
            gl10.glDeleteTextures(iArr2.length, iArr2, 0);
            this.h.glFlush();
            i++;
        }
        gl10.glGenTextures(6, iArr2, 0);
        this.h.glBindTexture(3553, iArr2[0]);
        this.h.glLoadIdentity();
        this.h.glMatrixMode(5889);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.h.glEnable(3042);
            this.h.glBlendFunc(770, 771);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), iArr[i2], options);
            Bitmap[] bitmapArr = this.a;
            bitmapArr[i2] = bitmapDecodeResource;
            this.h.glBindTexture(3553, iArr2[i2]);
            this.h.glTexParameterf(3553, 10241, 9728.0f);
            this.h.glTexParameterf(3553, 10240, 9729.0f);
            GLUtils.texImage2D(3553, 0, bitmapArr[i2], 0);
            bitmapArr[i2].recycle();
        }
    }
}
