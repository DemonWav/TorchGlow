/*
 * TorchGlow
 *
 * IntelliJ JVM Bytecode PSI Equivalency Framework
 *
 * Copyright (c) 2017 Kyle Wood
 *
 * MIT License
 */

@file:JvmName("TorchMembers")

package com.demonwav.torchglow.psi

import com.demonwav.torchglow.TorchModifierHolder

interface TorchMember : TorchClassElement, TorchNamedElement, TorchModifierHolder, TorchAnnotationHolder

fun TorchMember.hasModifier(modifier: String) = modifiers.contains(modifier)
