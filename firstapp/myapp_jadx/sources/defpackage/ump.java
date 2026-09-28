package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ump extends vmp {
    public String f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;

    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }
    }

    public ump() {
        this.e = -1;
        this.f = null;
        this.g = -1;
        this.h = 0;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = 0;
    }

    @Override // defpackage.mlp
    public final void a(HashMap<String, q9i0> map) {
        throw null;
    }

    @Override // defpackage.mlp
    /* JADX INFO: renamed from: b */
    public final mlp clone() {
        ump umpVar = new ump();
        super.c(this);
        umpVar.f = this.f;
        umpVar.g = this.g;
        umpVar.h = this.h;
        umpVar.i = this.i;
        umpVar.j = Float.NaN;
        umpVar.k = this.k;
        umpVar.l = this.l;
        umpVar.m = this.m;
        umpVar.n = this.n;
        return umpVar;
    }

    public final void h(Object obj, String str) {
        switch (str) {
            case "transitionEasing":
                this.f = obj.toString();
                break;
            case "percentWidth":
                this.i = mlp.g((Number) obj);
                break;
            case "percentHeight":
                this.j = mlp.g((Number) obj);
                break;
            case "drawPath":
                Number number = (Number) obj;
                this.h = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "sizePercent":
                float fG = mlp.g((Number) obj);
                this.i = fG;
                this.j = fG;
                break;
            case "percentX":
                this.k = mlp.g((Number) obj);
                break;
            case "percentY":
                this.l = mlp.g((Number) obj);
                break;
        }
    }

    @Override // defpackage.mlp
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wk30.m);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        int i = 0;
        while (true) {
            String str = oAudzpbdOhCI.SsFHHTkGnI;
            if (i >= indexCount) {
                if (this.a == -1) {
                    Log.e(str, "no frame position");
                    return;
                }
                return;
            }
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = a.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.U0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                    } else {
                        this.c = typedArrayObtainStyledAttributes.getString(index);
                    }
                    break;
                case 2:
                    this.a = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                        this.f = skf.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    } else {
                        this.f = typedArrayObtainStyledAttributes.getString(index);
                    }
                    break;
                case 4:
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 5:
                    this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
                    break;
                case 6:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 7:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    this.i = f;
                    this.j = f;
                    break;
                case 9:
                    this.o = typedArrayObtainStyledAttributes.getInt(index, this.o);
                    break;
                case 10:
                    this.g = typedArrayObtainStyledAttributes.getInt(index, this.g);
                    break;
                case 11:
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 12:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                default:
                    Log.e(str, "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
            i++;
        }
    }
}
