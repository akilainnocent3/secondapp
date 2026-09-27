package com.yandex.div.core.resources;

import android.content.res.Resources;
import android.util.TypedValue;
import dr.w2;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.j0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class PrimitiveResourceCache extends ResourcesWrapper {

    @l
    private final ConcurrentHashMap<Integer, Boolean> booleans;

    @l
    private final ConcurrentHashMap<Integer, Integer> dimensionPixelOffsets;

    @l
    private final ConcurrentHashMap<Integer, Integer> dimensionPixelSizes;

    @l
    private final ConcurrentHashMap<Integer, Float> dimensions;

    @l
    private final ConcurrentHashMap<Integer, Integer> integers;

    @m
    private TypedValue tmpValue;

    @l
    private final Object tmpValueLock;

    public PrimitiveResourceCache(@l Resources resources) {
        super(resources);
        this.booleans = new ConcurrentHashMap<>();
        this.dimensions = new ConcurrentHashMap<>();
        this.dimensionPixelOffsets = new ConcurrentHashMap<>();
        this.dimensionPixelSizes = new ConcurrentHashMap<>();
        this.integers = new ConcurrentHashMap<>();
        this.tmpValue = new TypedValue();
        this.tmpValueLock = new Object();
    }

    private final <T> T getAndCacheIfPossible(int i10, ConcurrentHashMap<Integer, T> concurrentHashMap, ds.l<? super TypedValue, Boolean> lVar, ds.l<? super TypedValue, ? extends T> lVar2) throws Resources.NotFoundException {
        T t10 = concurrentHashMap.get(Integer.valueOf(i10));
        if (t10 != null) {
            return t10;
        }
        TypedValue typedValueObtainTempTypedValue = obtainTempTypedValue();
        try {
            super.getValue(i10, typedValueObtainTempTypedValue, true);
            if (lVar.invoke(typedValueObtainTempTypedValue).booleanValue()) {
                T tInvoke = lVar2.invoke(typedValueObtainTempTypedValue);
                if (typedValueObtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i10), tInvoke);
                }
                j0.d(1);
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                j0.c(1);
                return tInvoke;
            }
            throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValueObtainTempTypedValue.type) + " is not valid");
        } catch (Throwable th2) {
            j0.d(1);
            releaseTempTypedValue(typedValueObtainTempTypedValue);
            j0.c(1);
            throw th2;
        }
    }

    private final TypedValue obtainTempTypedValue() {
        TypedValue typedValue;
        synchronized (this.tmpValueLock) {
            try {
                typedValue = this.tmpValue;
                if (typedValue != null) {
                    this.tmpValue = null;
                } else {
                    typedValue = null;
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return typedValue == null ? new TypedValue() : typedValue;
    }

    private final void releaseTempTypedValue(TypedValue typedValue) {
        synchronized (this.tmpValueLock) {
            try {
                if (this.tmpValue == null) {
                    this.tmpValue = typedValue;
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public boolean getBoolean(int i10) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.booleans;
        Boolean bool = concurrentHashMap.get(Integer.valueOf(i10));
        if (bool == null) {
            TypedValue typedValueObtainTempTypedValue = obtainTempTypedValue();
            boolean z10 = true;
            try {
                super.getValue(i10, typedValueObtainTempTypedValue, true);
                int i11 = typedValueObtainTempTypedValue.type;
                if (i11 < 16 || i11 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValueObtainTempTypedValue.type) + " is not valid");
                }
                if (typedValueObtainTempTypedValue.data == 0) {
                    z10 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z10);
                if (typedValueObtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i10), boolValueOf);
                }
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                bool = boolValueOf;
            } catch (Throwable th2) {
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                throw th2;
            }
        }
        return bool.booleanValue();
    }

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public float getDimension(int i10) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.dimensions;
        Float f10 = concurrentHashMap.get(Integer.valueOf(i10));
        if (f10 == null) {
            TypedValue typedValueObtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(i10, typedValueObtainTempTypedValue, true);
                if (typedValueObtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValueObtainTempTypedValue.type) + " is not valid");
                }
                Float fValueOf = Float.valueOf(TypedValue.complexToDimension(typedValueObtainTempTypedValue.data, getDisplayMetrics()));
                if (typedValueObtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i10), fValueOf);
                }
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                f10 = fValueOf;
            } catch (Throwable th2) {
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                throw th2;
            }
        }
        return f10.floatValue();
    }

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public int getDimensionPixelOffset(int i10) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.dimensionPixelOffsets;
        Integer num = concurrentHashMap.get(Integer.valueOf(i10));
        if (num == null) {
            TypedValue typedValueObtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(i10, typedValueObtainTempTypedValue, true);
                if (typedValueObtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValueObtainTempTypedValue.type) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(TypedValue.complexToDimensionPixelOffset(typedValueObtainTempTypedValue.data, getDisplayMetrics()));
                if (typedValueObtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i10), numValueOf);
                }
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                num = numValueOf;
            } catch (Throwable th2) {
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                throw th2;
            }
        }
        return num.intValue();
    }

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public int getDimensionPixelSize(int i10) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.dimensionPixelSizes;
        Integer num = concurrentHashMap.get(Integer.valueOf(i10));
        if (num == null) {
            TypedValue typedValueObtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(i10, typedValueObtainTempTypedValue, true);
                if (typedValueObtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValueObtainTempTypedValue.type) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(TypedValue.complexToDimensionPixelSize(typedValueObtainTempTypedValue.data, getDisplayMetrics()));
                if (typedValueObtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i10), numValueOf);
                }
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                num = numValueOf;
            } catch (Throwable th2) {
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                throw th2;
            }
        }
        return num.intValue();
    }

    @Override // com.yandex.div.core.resources.ResourcesWrapper, android.content.res.Resources
    public int getInteger(int i10) throws Resources.NotFoundException {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.integers;
        Integer num = concurrentHashMap.get(Integer.valueOf(i10));
        if (num == null) {
            TypedValue typedValueObtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(i10, typedValueObtainTempTypedValue, true);
                int i11 = typedValueObtainTempTypedValue.type;
                if (i11 < 16 || i11 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i10) + " type #0x" + Integer.toHexString(typedValueObtainTempTypedValue.type) + " is not valid");
                }
                Integer numValueOf = Integer.valueOf(typedValueObtainTempTypedValue.data);
                if (typedValueObtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i10), numValueOf);
                }
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                num = numValueOf;
            } catch (Throwable th2) {
                releaseTempTypedValue(typedValueObtainTempTypedValue);
                throw th2;
            }
        }
        return num.intValue();
    }
}
