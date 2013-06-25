/*
 * Copyright (C) 2013 Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.swift.service;

import com.facebook.nifty.core.RequestContext;

public class ThriftEventHandler
{
    public Object getContext(String methodName, RequestContext requestContext)
    {
        return null;
    }

    public void preRead(Object context, String methodName) {}
    public void postRead(Object context, String methodName, Object[] args) {}
    public void preWrite(Object context, String methodName, Object result) {}
    public void preWriteException(Object context, String methodName, Exception e) {}
    public void postWrite(Object context, String methodName, Object result) {}
    public void postWriteException(Object context, String methodName, Exception e) {}
    public void done(Object context, String methodName) {}
}