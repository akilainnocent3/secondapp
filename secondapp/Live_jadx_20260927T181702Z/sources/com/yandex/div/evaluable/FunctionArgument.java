package com.yandex.div.evaluable;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class FunctionArgument {
    private final boolean isVariadic;

    @l
    private final EvaluableType type;

    public FunctionArgument(@l EvaluableType type, boolean z10) {
        m0.p(type, "type");
        this.type = type;
        this.isVariadic = z10;
    }

    public static /* synthetic */ FunctionArgument copy$default(FunctionArgument functionArgument, EvaluableType evaluableType, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            evaluableType = functionArgument.type;
        }
        if ((i10 & 2) != 0) {
            z10 = functionArgument.isVariadic;
        }
        return functionArgument.copy(evaluableType, z10);
    }

    @l
    public final EvaluableType component1() {
        return this.type;
    }

    public final boolean component2() {
        return this.isVariadic;
    }

    @l
    public final FunctionArgument copy(@l EvaluableType type, boolean z10) {
        m0.p(type, "type");
        return new FunctionArgument(type, z10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunctionArgument)) {
            return false;
        }
        FunctionArgument functionArgument = (FunctionArgument) obj;
        return this.type == functionArgument.type && this.isVariadic == functionArgument.isVariadic;
    }

    @l
    public final EvaluableType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        boolean z10 = this.isVariadic;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final boolean isVariadic() {
        return this.isVariadic;
    }

    @l
    public String toString() {
        return "FunctionArgument(type=" + this.type + ", isVariadic=" + this.isVariadic + ')';
    }

    public /* synthetic */ FunctionArgument(EvaluableType evaluableType, boolean z10, int i10, x xVar) {
        this(evaluableType, (i10 & 2) != 0 ? false : z10);
    }
}
