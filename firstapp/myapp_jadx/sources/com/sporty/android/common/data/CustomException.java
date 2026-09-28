package com.sporty.android.common.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\u000b\u001a\u00020\u0006H\u0096\u0080\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nÊ\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0000¨\u0006\f"}, d2 = {"Lcom/sporty/android/common/data/CustomException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "type", "Lcom/sporty/android/common/data/CustomExceptionType;", "errMsg", "", "<init>", "(Lcom/sporty/android/common/data/CustomExceptionType;Ljava/lang/String;)V", "getType", "()Lcom/sporty/android/common/data/CustomExceptionType;", "toString", "common", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CustomException extends Exception {
    public static final int $stable = 8;
    private final CustomExceptionType type;

    public /* synthetic */ CustomException(CustomExceptionType customExceptionType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CustomExceptionType.ERROR : customExceptionType, (i & 2) != 0 ? "" : str);
    }

    public final CustomExceptionType getType() {
        return this.type;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CustomException(type=" + this.type + ", msg=" + getMessage() + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomException(CustomExceptionType customExceptionType, String str) {
        super(str);
        customExceptionType.getClass();
        str.getClass();
        this.type = customExceptionType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
