package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class blh {
    public static final Class<?>[] hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static final HashMap<Class<?>, Class<?>> f35088sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static Map<String, Method> f35089tq = new HashMap();

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        f35088sd = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        hww = new Class[0];
    }

    public static int hww(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int hww(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
