package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface xgp<R> extends wgp {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    String getName();

    List<Object> getParameters();

    qhp getReturnType();

    List<Object> getTypeParameters();

    shp getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
