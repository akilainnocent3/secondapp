package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.opengl.GLU;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes7.dex */
public final class mpe implements GLSurfaceView.Renderer {
    public GL10 C;
    public final fgg D;
    public final ope a;
    public final hln b;
    public final Context c;
    public edg i;
    public int d = 142;
    public int e = 0;
    public int f = 0;
    public int v = 0;
    public int w = -15;
    public int y = 106;
    public int z = 45;
    public int A = 1;
    public int B = 1;

    public mpe(Context context, fgg fggVar) {
        this.b = new hln(context);
        this.a = new ope(context);
        this.c = context;
        this.D = fggVar;
    }

    public final void a(int[] iArr, int[] iArr2, Float f, Float f2) {
        float fFloatValue = f.floatValue();
        ope opeVar = this.a;
        opeVar.d = fFloatValue;
        float fFloatValue2 = f2.floatValue();
        hln hlnVar = this.b;
        hlnVar.d = fFloatValue2;
        opeVar.b = iArr;
        hlnVar.b = iArr2;
        GL10 gl10 = this.C;
        if (gl10 == null) {
            return;
        }
        gl10.glEnable(3553);
        Context context = this.c;
        hlnVar.d(context, iArr2);
        hlnVar.c(context);
        opeVar.e(context, iArr);
        opeVar.d(context);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        edg edgVar = this.i;
        if (edgVar != null) {
            int iOrdinal = edgVar.ordinal();
            fgg fggVar = this.D;
            switch (iOrdinal) {
                case 0:
                    int i = this.A;
                    int i2 = this.B;
                    gl10.glViewport(0, 0, i, i2);
                    gl10.glMatrixMode(5889);
                    gl10.glLoadIdentity();
                    GLU.gluPerspective(gl10, 25.0f, i / i2, 0.2f, 100.0f);
                    gl10.glMatrixMode(5888);
                    gl10.glEnable(3042);
                    gl10.glBlendFunc(770, 771);
                    gl10.glEnable(2929);
                    gl10.glDepthFunc(515);
                    gl10.glHint(3152, 4354);
                    gl10.glClear(16640);
                    gl10.glLoadIdentity();
                    GLU.gluLookAt(gl10, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    gl10.glTranslatef(0.0f, 0.0f, -4.0f);
                    int i3 = this.d;
                    if (i3 != 0) {
                        gl10.glRotatef(i3, this.w, this.y, this.z);
                        this.d -= this.e;
                        this.f = 1;
                    } else if (this.f == 1) {
                        fggVar.r0(1, false);
                    }
                    break;
                case 1:
                    int i4 = this.A;
                    int i5 = this.B;
                    gl10.glViewport(0, 0, i4, i5);
                    gl10.glMatrixMode(5889);
                    gl10.glLoadIdentity();
                    GLU.gluPerspective(gl10, 25.0f, i4 / i5, 0.2f, 100.0f);
                    gl10.glMatrixMode(5888);
                    gl10.glEnable(3042);
                    gl10.glBlendFunc(770, 771);
                    gl10.glEnable(2929);
                    gl10.glDepthFunc(515);
                    gl10.glHint(3152, 4354);
                    gl10.glClear(16640);
                    gl10.glLoadIdentity();
                    GLU.gluLookAt(gl10, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    gl10.glTranslatef(0.0f, 0.0f, -4.0f);
                    int i6 = this.d;
                    if (i6 != 40) {
                        gl10.glRotatef(i6, this.w, this.y, this.z);
                        this.d -= this.e;
                        this.f = 1;
                    } else {
                        gl10.glRotatef(this.v, 0.0f, 30.0f, 0.0f);
                        int i7 = this.v;
                        if (i7 < 90) {
                            this.v = i7 + 5;
                        }
                        if (this.f == 1) {
                            fggVar.r0(2, false);
                        }
                    }
                    break;
                case 2:
                    int i8 = this.A;
                    int i9 = this.B;
                    gl10.glViewport(0, 0, i8, i9);
                    gl10.glMatrixMode(5889);
                    gl10.glLoadIdentity();
                    GLU.gluPerspective(gl10, 25.0f, i8 / i9, 0.2f, 100.0f);
                    gl10.glMatrixMode(5888);
                    gl10.glEnable(3042);
                    gl10.glBlendFunc(770, 771);
                    gl10.glEnable(2929);
                    gl10.glDepthFunc(515);
                    gl10.glHint(3152, 4354);
                    gl10.glClear(16640);
                    gl10.glLoadIdentity();
                    GLU.gluLookAt(gl10, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    gl10.glTranslatef(0.0f, 0.0f, -4.0f);
                    int i10 = this.d;
                    if (i10 != 0) {
                        gl10.glRotatef(i10, this.w, this.y, this.z);
                        this.d -= this.e;
                        this.f = 1;
                    } else {
                        gl10.glRotatef(this.v, 60.0f, 0.0f, 0.0f);
                        int i11 = this.v;
                        if (i11 < 180) {
                            this.v = i11 + 5;
                        }
                        if (this.f == 1) {
                            fggVar.r0(3, false);
                        }
                    }
                    break;
                case 3:
                    int i12 = this.A;
                    int i13 = this.B;
                    gl10.glViewport(0, 0, i12, i13);
                    gl10.glMatrixMode(5889);
                    gl10.glLoadIdentity();
                    GLU.gluPerspective(gl10, 25.0f, i12 / i13, 0.2f, 100.0f);
                    gl10.glMatrixMode(5888);
                    gl10.glEnable(3042);
                    gl10.glBlendFunc(770, 771);
                    gl10.glEnable(2929);
                    gl10.glDepthFunc(515);
                    gl10.glHint(3152, 4354);
                    gl10.glClear(16640);
                    gl10.glLoadIdentity();
                    GLU.gluLookAt(gl10, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    gl10.glTranslatef(0.0f, 0.0f, -4.0f);
                    int i14 = this.d;
                    if (i14 != 40) {
                        gl10.glRotatef(i14, this.w, this.y, this.z);
                        this.d -= this.e;
                        this.f = 1;
                    } else {
                        gl10.glRotatef(this.v, 0.0f, -30.0f, 0.0f);
                        int i15 = this.v;
                        if (i15 < 90) {
                            this.v = i15 + 5;
                        }
                        if (this.f == 1) {
                            fggVar.r0(4, false);
                        }
                    }
                    break;
                case 4:
                    int i16 = this.A;
                    int i17 = this.B;
                    gl10.glViewport(0, 0, i16, i17);
                    gl10.glMatrixMode(5889);
                    gl10.glLoadIdentity();
                    GLU.gluPerspective(gl10, 25.0f, i16 / i17, 0.2f, 100.0f);
                    gl10.glMatrixMode(5888);
                    gl10.glEnable(3042);
                    gl10.glBlendFunc(770, 771);
                    gl10.glEnable(2929);
                    gl10.glDepthFunc(515);
                    gl10.glHint(3152, 4354);
                    gl10.glClear(16640);
                    gl10.glLoadIdentity();
                    GLU.gluLookAt(gl10, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    gl10.glTranslatef(0.0f, 0.0f, -4.0f);
                    int i18 = this.d;
                    if (i18 != 40) {
                        gl10.glRotatef(i18, this.w, this.y, this.z);
                        this.d -= this.e;
                        this.f = 1;
                    } else {
                        gl10.glRotatef(this.v, 30.0f, 0.0f, 0.0f);
                        int i19 = this.v;
                        if (i19 < 90) {
                            this.v = i19 + 5;
                        }
                        if (this.f == 1) {
                            fggVar.r0(5, false);
                        }
                    }
                    break;
                case 5:
                    int i20 = this.A;
                    int i21 = this.B;
                    gl10.glViewport(0, 0, i20, i21);
                    gl10.glMatrixMode(5889);
                    gl10.glLoadIdentity();
                    GLU.gluPerspective(gl10, 25.0f, i20 / i21, 0.2f, 100.0f);
                    gl10.glMatrixMode(5888);
                    gl10.glEnable(3042);
                    gl10.glBlendFunc(770, 771);
                    gl10.glEnable(2929);
                    gl10.glDepthFunc(515);
                    gl10.glHint(3152, 4354);
                    gl10.glClear(16640);
                    gl10.glLoadIdentity();
                    GLU.gluLookAt(gl10, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    gl10.glTranslatef(0.0f, 0.0f, -4.0f);
                    int i22 = this.d;
                    if (i22 != 40) {
                        gl10.glRotatef(i22, this.w, this.y, this.z);
                        this.d -= this.e;
                        this.f = 1;
                    } else {
                        gl10.glRotatef(this.v, -30.0f, 0.0f, 0.0f);
                        int i23 = this.v;
                        if (i23 < 90) {
                            this.v = i23 + 5;
                        }
                        if (this.f == 1) {
                            fggVar.r0(6, false);
                        }
                    }
                    break;
                case 6:
                    gl10.glViewport(0, 0, this.A, this.B);
                    gl10.glMatrixMode(5889);
                    gl10.glLoadIdentity();
                    GLU.gluPerspective(gl10, 25.0f, 1.0f, 0.1f, 20.0f);
                    gl10.glMatrixMode(5888);
                    gl10.glLoadIdentity();
                    gl10.glEnable(3042);
                    gl10.glBlendFunc(770, 771);
                    gl10.glDisable(2929);
                    gl10.glClearDepthf(1.0f);
                    gl10.glClear(16640);
                    gl10.glLoadIdentity();
                    GLU.gluLookAt(gl10, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    gl10.glTranslatef(0.0f, 0.0f, -4.0f);
                    gl10.glRotatef(142.0f, -15.0f, -106.0f, 45.0f);
                    break;
            }
        }
        int i24 = this.d;
        ope opeVar = this.a;
        hln hlnVar = this.b;
        if (i24 == 100) {
            hlnVar.d = 0.8f;
            opeVar.d = 1.2f;
        }
        edg edgVar2 = this.i;
        Context context = this.c;
        hlnVar.a(gl10, context, edgVar2);
        opeVar.a(gl10, context, this.i, this.d);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.A = i;
        this.B = i2;
        if (i2 == 0) {
            i2 = 1;
        }
        gl10.glViewport(0, 0, i, i2);
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        GLU.gluPerspective(gl10, 45.0f, i / i2, 0.2f, 10.0f);
        gl10.glEnable(3042);
        gl10.glShadeModel(7425);
        gl10.glDisable(3024);
        gl10.glBlendFunc(770, 771);
        gl10.glDisable(2929);
        gl10.glMatrixMode(5888);
        gl10.glLoadIdentity();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        gl10.glClearDepthf(1.0f);
        this.C = gl10;
        this.b.b(gl10);
        this.a.c(gl10);
        gl10.glEnable(3553);
    }
}
