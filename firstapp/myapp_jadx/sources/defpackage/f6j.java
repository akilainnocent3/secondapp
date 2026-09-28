package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f6j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f6j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        php<?>[] phpVarArrTypeParametersSerializers;
        int i = this.a;
        final Bitmap bitmap = null;
        arrayList = null;
        ArrayList arrayList = null;
        bitmap = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                final u6j u6jVar = (u6j) obj;
                if (!u6jVar.u0) {
                    u6jVar.u0 = true;
                    ajh ajhVarL1 = u6jVar.l1();
                    AppCompatImageView appCompatImageView = ajhVarL1 != null ? ajhVarL1.f : null;
                    a6h a6hVar = u6jVar.C0;
                    Drawable drawable = appCompatImageView != null ? appCompatImageView.getDrawable() : null;
                    a6hVar.getClass();
                    if (drawable != null) {
                        try {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                            bitmapCreateBitmap.getClass();
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                            drawable.draw(canvas);
                            bitmap = bitmapCreateBitmap;
                        } catch (Exception unused) {
                        }
                    }
                    if (appCompatImageView == null || bitmap == null) {
                        ajh ajhVarL2 = u6jVar.l1();
                        if (ajhVarL2 != null) {
                            ajhVarL2.f.setOnClickListener(new View.OnClickListener() { // from class: o6j
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    u6j u6jVar2 = u6jVar;
                                    u6jVar2.d1(u6jVar2.getActivity());
                                }
                            });
                        }
                    } else {
                        final float width = bitmap.getWidth() / appCompatImageView.getWidth();
                        final float height = bitmap.getHeight() / appCompatImageView.getHeight();
                        ajh ajhVarL3 = u6jVar.l1();
                        if (ajhVarL3 != null) {
                            ajhVarL3.f.setOnTouchListener(new View.OnTouchListener() { // from class: p6j
                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view, MotionEvent motionEvent) {
                                    if (motionEvent.getAction() == 1) {
                                        int x = (int) (motionEvent.getX() * width);
                                        int y = (int) (motionEvent.getY() * height);
                                        if (x < 0) {
                                            return false;
                                        }
                                        Bitmap bitmap2 = bitmap;
                                        if (x >= bitmap2.getWidth() || y < 0 || y >= bitmap2.getHeight()) {
                                            return false;
                                        }
                                        u6j u6jVar2 = u6jVar;
                                        a6h a6hVar2 = u6jVar2.C0;
                                        int pixel = bitmap2.getPixel(x, y);
                                        a6hVar2.getClass();
                                        if (pixel != 0) {
                                            u6jVar2.d1(u6jVar2.getActivity());
                                            return true;
                                        }
                                        djh djhVar = u6jVar2.b;
                                        if (djhVar != null) {
                                            djhVar.e.d.performClick();
                                            return true;
                                        }
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                }
                u6jVar.n0(new Function0() { // from class: i6j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        u6j u6jVar2 = u6jVar;
                        u6jVar2.k1();
                        ajh ajhVarL4 = u6jVar2.l1();
                        if (ajhVarL4 != null) {
                            ej5.c(o8i0.d(u6jVar2.t0()), null, null, new w6j(u6jVar2, ajhVarL4.e, null), 3);
                            ajh ajhVarL5 = u6jVar2.l1();
                            u6jVar2.D0 = ajhVarL5 != null ? ajhVarL5.y.getX() : 0.0f;
                            ajh ajhVarL6 = u6jVar2.l1();
                            u6jVar2.E0 = ajhVarL6 != null ? ajhVarL6.y.getY() : 0.0f;
                        }
                        return Unit.a;
                    }
                });
                return Unit.a;
            default:
                o1k<?> o1kVar = ((kr10) obj).b;
                if (o1kVar != null && (phpVarArrTypeParametersSerializers = o1kVar.typeParametersSerializers()) != null) {
                    arrayList = new ArrayList(phpVarArrTypeParametersSerializers.length);
                    for (php<?> phpVar : phpVarArrTypeParametersSerializers) {
                        arrayList.add(phpVar.getDescriptor());
                    }
                }
                return fz9.b(arrayList);
        }
    }
}
