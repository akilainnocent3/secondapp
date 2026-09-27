package u1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import dr.z0;
import java.io.Serializable;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    @oy.l
    public static final Bundle a() {
        return new Bundle(0);
    }

    @oy.l
    public static final Bundle b(@oy.l z0<String, ? extends Object>... z0VarArr) {
        Bundle bundle = new Bundle(z0VarArr.length);
        for (z0<String, ? extends Object> z0Var : z0VarArr) {
            String strD = z0Var.d();
            Object objG = z0Var.g();
            if (objG == null) {
                bundle.putString(strD, null);
            } else if (objG instanceof Boolean) {
                bundle.putBoolean(strD, ((Boolean) objG).booleanValue());
            } else if (objG instanceof Byte) {
                bundle.putByte(strD, ((Number) objG).byteValue());
            } else if (objG instanceof Character) {
                bundle.putChar(strD, ((Character) objG).charValue());
            } else if (objG instanceof Double) {
                bundle.putDouble(strD, ((Number) objG).doubleValue());
            } else if (objG instanceof Float) {
                bundle.putFloat(strD, ((Number) objG).floatValue());
            } else if (objG instanceof Integer) {
                bundle.putInt(strD, ((Number) objG).intValue());
            } else if (objG instanceof Long) {
                bundle.putLong(strD, ((Number) objG).longValue());
            } else if (objG instanceof Short) {
                bundle.putShort(strD, ((Number) objG).shortValue());
            } else if (objG instanceof Bundle) {
                bundle.putBundle(strD, (Bundle) objG);
            } else if (objG instanceof CharSequence) {
                bundle.putCharSequence(strD, (CharSequence) objG);
            } else if (objG instanceof Parcelable) {
                bundle.putParcelable(strD, (Parcelable) objG);
            } else if (objG instanceof boolean[]) {
                bundle.putBooleanArray(strD, (boolean[]) objG);
            } else if (objG instanceof byte[]) {
                bundle.putByteArray(strD, (byte[]) objG);
            } else if (objG instanceof char[]) {
                bundle.putCharArray(strD, (char[]) objG);
            } else if (objG instanceof double[]) {
                bundle.putDoubleArray(strD, (double[]) objG);
            } else if (objG instanceof float[]) {
                bundle.putFloatArray(strD, (float[]) objG);
            } else if (objG instanceof int[]) {
                bundle.putIntArray(strD, (int[]) objG);
            } else if (objG instanceof long[]) {
                bundle.putLongArray(strD, (long[]) objG);
            } else if (objG instanceof short[]) {
                bundle.putShortArray(strD, (short[]) objG);
            } else if (objG instanceof Object[]) {
                Class<?> componentType = objG.getClass().getComponentType();
                m0.m(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    m0.n(objG, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(strD, (Parcelable[]) objG);
                } else if (String.class.isAssignableFrom(componentType)) {
                    m0.n(objG, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(strD, (String[]) objG);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    m0.n(objG, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(strD, (CharSequence[]) objG);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + strD + '\"');
                    }
                    bundle.putSerializable(strD, (Serializable) objG);
                }
            } else if (objG instanceof Serializable) {
                bundle.putSerializable(strD, (Serializable) objG);
            } else if (objG instanceof IBinder) {
                bundle.putBinder(strD, (IBinder) objG);
            } else if (objG instanceof Size) {
                b.a(bundle, strD, (Size) objG);
            } else {
                if (!(objG instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objG.getClass().getCanonicalName() + " for key \"" + strD + '\"');
                }
                b.b(bundle, strD, (SizeF) objG);
            }
        }
        return bundle;
    }
}
