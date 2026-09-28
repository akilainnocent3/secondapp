package defpackage;

import android.os.IBinder;
import com.sporty.android.permission.location.KN.qUnCRF;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class rcy<T> extends eym.a {
    public final Object a;

    public rcy(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.a = obj;
    }

    public static <T> T d(eym eymVar) {
        if (eymVar instanceof rcy) {
            return (T) ((rcy) eymVar).a;
        }
        IBinder iBinderAsBinder = eymVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            hb5.a(hce0.a(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
            return null;
        }
        hm20.h(field);
        if (field.isAccessible()) {
            hb5.a(qUnCRF.AtAeeQQvKuev);
            return null;
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
